#!/usr/bin/env python3

# store_data.py
# store_data is an example of how storing data between steps

import argparse

import kfp.components as cpt
import kfp.compiler as cmp
import kfp.dsl as dsl


# Functions ------------------------------------------------------------------------------------------------------------
def prepare_data(text: str) -> list:
    import nltk
    tokenizer = nltk.RegexpTokenizer(r"\w+")
    plain_text = tokenizer.tokenize(text=text)
    return plain_text


def store_data(word_list: list, out_path: str, out_name: str):
    import os
    import pickle
    out_path_pkl = os.path.join(out_path, out_name)
    with open(out_path_pkl, 'wb') as file:
        pickle.dump(word_list, file)


def load_data(input_path: str, out_name: str) -> list:
    import os
    import pickle
    input_path_pkl = os.path.join(input_path, out_name)
    with open(input_path_pkl, 'rb') as wl:
        word_list = pickle.load(wl)
    return word_list


def count_word(word_list: list, word: str) -> int:
    return word_list.count(word)


# Main -------------------------------------------------------------------------------------------------------------
def main(args):
    TEXT = """The Kubeflow project is dedicated to making deployments of machine learning (ML) 
    workflows on Kubernetes simple, portable and scalable. Our goal is not to recreate 
    other services, but to provide a straightforward way to deploy best-of-breed
    open-source systems for ML to diverse infrastructures. Anywhere you are running 
    Kubernetes, you should be able to run Kubeflow.
    """
    OUT_COMPONENTS_DIR = args.output_component_dir
    OUT_PIPELINE_DIR = args.output_pipeline_dir

    prepare_data_component = cpt.func_to_container_op(prepare_data,
                                                      packages_to_install=['nltk==3.5'],
                                                      output_component_file=f'{OUT_COMPONENTS_DIR}/prepare_data.component'
                                                      )
    store_data_component = cpt.func_to_container_op(store_data,
                                                    output_component_file=f'{OUT_COMPONENTS_DIR}/store_data.component')

    load_data_component = cpt.func_to_container_op(load_data,
                                                   output_component_file=f'{OUT_COMPONENTS_DIR}/load_data.component')
    count_word_component = cpt.func_to_container_op(count_word,
                                                    output_component_file=f'{OUT_COMPONENTS_DIR}/load_data.component')

    @dsl.pipeline(name="Store data pipeline",
                  description="A pipeline to test volume mounting")
    def build_store_data_pipeline(sentence=TEXT, word="Kubeflow"):
        # General setting
        out_vol_op = dsl.VolumeOp(name='create volume',
                                  resource_name='data-processing',
                                  size="5Gi",
                                  modes=dsl.VOLUME_MODE_RWO)

        prepare_data_task = prepare_data_component(text=sentence)
        store_data_task = store_data_component(word_list=prepare_data_task.output,
                                               out_path="/data-processing", out_name="list.pkl")
        store_data_task.add_pvolumes({"/data-processing": out_vol_op.volume})
        store_data_task.after(prepare_data_task)

        load_data_task = load_data_component(input_path="/data-processing", out_name="list.pkl")
        load_data_task.add_pvolumes({"/data-processing": out_vol_op.volume})
        load_data_task.after(store_data_task)

        count_word_task = count_word_component(word_list=load_data_task.output,
                                               word=word)
        count_word_task.after(load_data_task)

    pipe_compiler = cmp.Compiler()
    pipe_compiler.compile(pipeline_func=build_store_data_pipeline,
                          package_path=f'{OUT_PIPELINE_DIR}/store_data_pipeline.zip')


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Run pipeline builder")
    parser.add_argument('--output-component-dir', default='../../out/components')
    parser.add_argument('--output-pipeline-dir', default='../../out/pipelines')
    args = parser.parse_args()
    main(args=args)
