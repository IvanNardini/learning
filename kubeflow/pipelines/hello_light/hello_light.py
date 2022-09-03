#!/usr/bin/env python3

# hellokubeflow_light.py
# hellokubeflow_light is a hello world python module for testing Kubeflow
# Python lightweight components (https://www.kubeflow.org/docs/pipelines/sdk/sdk-overview/#creating-lightweight-components)
# Note: Python lightweight does not require container image
#
# Steps:
# 1 - Create a simple python function
# 2 - Convert your Python function into a pipeline component and write a file
# 3 - Load the file in a pipeline component
# 4 - Define the pipeline using the Kubeflow Pipelines DSL
# 5 - Compile the pipeline to generate a compressed YAML definition of the pipeline

import argparse
import kfp.components as cpt
import kfp.compiler as cmp
import kfp.dsl as dsl


# Functions ------------------------------------------------------------------------------------------------------------

# Create a simple python function
def hello_kubeflow(name: str) -> str:
    msg = f'{name} met Kubeflow at Valentines day! <3'
    return msg


# Main -----------------------------------------------------------------------------------------------------------------
def main(args):
    OUT_COMPONENTS_DIR = args.output_component_dir
    OUT_PIPELINE_DIR = args.output_pipeline_dir

    # Write the component file of Python function
    hello_component = cpt.create_component_from_func(func=hello_kubeflow,
                                   output_component_file=f'{OUT_COMPONENTS_DIR}/hello_kubeflow.component')

    # Read the component file
    hello_component = cpt.load_component_from_file(filename=f'{OUT_COMPONENTS_DIR}/hello_kubeflow.component')


    # Write a pipeline function using the Kubeflow Pipelines DSL
    @dsl.pipeline(name='Hello Kubeflow Pipeline',
                  description='A Hello Kubeflow pipeline')
    def hello_kubeflow_pipeline(
            name='Ivan'):
        task = hello_component(name)

    # Compile the pipeline to generate a compressed YAML definition of the pipeline
    cmp.Compiler().compile(pipeline_func=hello_kubeflow_pipeline,
                           package_path=f'{OUT_PIPELINE_DIR}/hello_kubeflow_pipeline.zip')


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Run pipeline builder")
    parser.add_argument('--output-component-dir', default='../out/components')
    parser.add_argument('--output-pipeline-dir', default='../out/pipelines')
    args = parser.parse_args()
    main(args=args)
