#!/usr/bin/env python3

# This is an example for testing conditions in Kubeflow
# Steps:
# 1 - Set components
# 2 - Define pipeline
# 3 - Compile Pipelines
# Goals are:
# - Testing download GCS component provided by Google
# - Testing conditions with dsl.Condition

import argparse
from uri import URI
import os
import kfp
import kfp.dsl as dsl
import kfp.components as cpt
from kfp.components import func_to_container_op
import kfp.compiler as cmp

# Variables  -----------------------------------------------------------------------------------------------------------

GCS_COMPONENT_PATH = '../../out/components/download_gcs_component.component'
GET_WORD_PATH = '../../out/components/get_word.component'

# Components  ----------------------------------------------------------------------------------------------------------

# Read text from Cloud Storage
gcs_download_component = kfp.components.load_component_from_file(filename=GCS_COMPONENT_PATH)

# Get word from text
get_word_component = kfp.components.load_component_from_file(filename=GET_WORD_PATH)

# Helper components
@func_to_container_op
def print_found(name: str):
    print(f'I find the {name} term')
    return None

@func_to_container_op
def print_not_found(name: str):
    print(f'I dont find the {name} term')
    return None

# Pipeline -------------------------------------------------------------------------------------------------------------

@dsl.pipeline(name='Conditional Kubeflow Pipeline',
              description='Test conditions')
def conditional_kubeflow_pipeline(uri_data_path: URI, name: str):
    # General setting
    out_vol_op = dsl.VolumeOp(name='Persistent Volume',
                              resource_name='data',
                              size="3Gi",
                              modes=dsl.VOLUME_MODE_RWO)
    # Download data
    step_1 = gcs_download_component(uri_data_path)
    step_1.add_pvolumes({'/data': out_vol_op.volume})
    # Check for name
    step_2 = get_word_component(text=step_1.output, word=name)
    step_2.after(step_1)
    # Condition
    is_name = step_2.output
    with dsl.Condition(is_name == 'True'):
        print_found(name=name)
    with dsl.Condition(is_name == 'False'):
        print_not_found(name=name)

# Main -----------------------------------------------------------------------------------------------------------------
def run_pipeline(args):
    out_pipe_dir = args.out_pipe_dir
    complier = cmp.Compiler()
    complier.compile(pipeline_func=conditional_kubeflow_pipeline,
                     package_path=f'{out_pipe_dir}/conditional_kubeflow_pipeline.zip')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Compile Pipeline")
    parser.add_argument('--out-pipe-dir', default='../../out/pipelines')
    args = parser.parse_args()
    run_pipeline(args=args)
