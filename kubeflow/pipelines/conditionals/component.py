#!/usr/bin/env python3

# This is an example for testing conditions in Kubeflow
# Steps:
# 1 - Define functions
# 2 - Define lightweight python components
# 3 - Write the component to a file
# Goal is:
# - Testing conditions with dsl.Condition

import argparse
import kfp.components as cpt


# Functions ------------------------------------------------------------------------------------------------------------

def get_word(text: str, word: str) -> bool:
    text_lower = text.lower()
    word_lower = word.lower()
    return True if word_lower in text_lower else False


# Component ------------------------------------------------------------------------------------------------------------
def run_component(args):
    OUT_COMPONENTS_DIR = args.out_component_dir
    get_word_component = cpt.create_component_from_func(get_word,
                                                        output_component_file=f'{OUT_COMPONENTS_DIR}/get_word.component')

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Create the component yaml")
    parser.add_argument('--out-component-dir', default='../../out/components')
    args = parser.parse_args()
    run_component(args=args)
