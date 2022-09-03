#!/usr/bin/env python3

# count_light.py
# count_light is an example a slight bit complex python lightweight component example
#
# Steps:
# 1 - Create python functions
# 2 - Convert your Python function into a pipeline component and write a file
# 3 - Load the file in a pipeline component
# 4 - Define the pipeline using the Kubeflow Pipelines DSL
# 5 - Compile the pipeline to generate a compressed YAML definition of the pipeline

import argparse
import kfp.components as cpt
import kfp.compiler as cmp
import kfp.dsl as dsl


# Functions ------------------------------------------------------------------------------------------------------------

def tokenizer(sentence: str) -> list:
    import nltk
    nltk.download('punkt')
    tokens = nltk.word_tokenize(sentence, language="italian")

    def helper_punct(tokens: list) -> list:
        clean_tokens = [token for token in tokens if token not in [',', '?']]
        return clean_tokens

    return helper_punct(tokens=tokens)


def count_tokens(tokens: list) -> int:
    return len(tokens)


# Main -----------------------------------------------------------------------------------------------------------------
def main(args):
    OUT_COMPONENTS_DIR = args.output_component_dir
    OUT_PIPELINE_DIR = args.output_pipeline_dir

    # Because we have a non standard library, create a container
    tokenizer_component = cpt.func_to_container_op(tokenizer,
                                                   packages_to_install=['nltk==3.5'],
                                                   output_component_file=f'{OUT_COMPONENTS_DIR}/tokenizer.component')
    count_tokens_component = cpt.create_component_from_func(count_tokens,
                                                            output_component_file=f'{OUT_COMPONENTS_DIR}/count_tokens.component')

    @dsl.pipeline(name='Count Kubeflow Pipeline',
                  description='Count Number of tokens in a sentence')
    def count_kubeflow_pipeline(sentence='Ciao Kubeflow, come stai oggi?'):
        tokenizer_task = tokenizer_component(sentence=sentence)
        count_tokens_task = count_tokens_component(tokens=tokenizer_task.output)

    complier = cmp.Compiler()
    complier.compile(pipeline_func=count_kubeflow_pipeline,
                     package_path=f'{OUT_PIPELINE_DIR}/count_kubeflow_pipeline.zip')

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Run pipeline builder")
    parser.add_argument('--output-component-dir', default='../../out/components')
    parser.add_argument('--output-pipeline-dir', default='../../out/pipelines')
    args = parser.parse_args()
    main(args=args)
