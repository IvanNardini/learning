#!/usr/bin/env python3

# pipeline.py
# pipeline is an example of how creating components from existing application code
# Improvements:
# - Wrapper python and annotations to simplify the pipeline
# - file_outputs option to avoid .add_pvolume repetitions
# Steps:
# Assuming that the Docker container image of the existing app is uploaded to a registry:
# 1 - Write a component function using the Kubeflow Pipelines DSL
# 2 - Write a pipeline function using the Kubeflow Pipelines DSL
# 3 - Compile the pipeline to generate a compressed YAML definition of the pipeline

import kfp
import kfp.components as cpt
import kfp.compiler as cmp
import kfp.dsl as dsl
from kfp.gcp import use_gcp_secret
import argparse

# Variables ------------------------------------------------------------------------------------------------------------
REGISTRY = "docker.io/in92"

# Components -----------------------------------------------------------------------------------------------------------

#TODO: file_output
@kfp.dsl.component
def prepare_component(text_path: dsl.PipelineParam, out_pkl_path: dsl.PipelineParam):
    return kfp.dsl.ContainerOp(
        name='Prepare data component',
        image=f'{REGISTRY}/kf_prepare:1.0.0',
        arguments=['--text-path', text_path,
                   '--pkl-path', out_pkl_path]
    ).apply(use_gcp_secret('user-gcp-sa'))


@kfp.dsl.component
def count_component(input_pkl_path: dsl.PipelineParam, word: dsl.PipelineParam, count_path: dsl.PipelineParam):
    return kfp.dsl.ContainerOp(
        name='Count word component',
        image=f'{REGISTRY}/kf_count_word:1.0.0',
        arguments=['--pkl-path', input_pkl_path,
                   '--word', word,
                   '--count-path', count_path]
    ).apply(use_gcp_secret('user-gcp-sa'))


# Main -----------------------------------------------------------------------------------------------------------------
def main(args):
    output_pipeline_dir = args.output_pipeline_dir

    @dsl.pipeline(name="Store data on bucket pipeline",
                  description="A pipeline to test I/O bucket")
    def build_pipeline(text_bucket_path: dsl.PipelineParam, pkl_bucket_path: dsl.PipelineParam, word:dsl.PipelineParam, count_path:dsl.PipelineParam):
        step_1 = prepare_component(text_path=text_bucket_path, out_pkl_path=pkl_bucket_path)
        step_2 = count_component(input_pkl_path=pkl_bucket_path, word=word, count_path=count_path)
        step_2.after(step_1)

    pipeline_compiler = cmp.Compiler()
    pipeline_compiler.compile(pipeline_func=build_pipeline,
                              package_path=f'{output_pipeline_dir}/store_data_pipeline_v2.zip')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Run pipeline builder")
    parser.add_argument('--output-pipeline-dir', default='../../out/pipelines')
    args = parser.parse_args()
    main(args=args)
