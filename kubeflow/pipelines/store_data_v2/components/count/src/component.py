#!/usr/bin/env python3

# component.py
# component is a simple component wrapper of data preparation step
# Notice: In this case I assume to read data from Cloud Storage.
# You have both pure storage APIs or tf. gfile.
# For portability, I prefer tf.gfile because you can debug your model
# locally and train it on cloud without changing a single line.

from tensorflow.io import gfile
from count import run_count_word
import pickle
import logging
import argparse


# Helpers --------------------------------------------------------------------------------------------------------------
def load_file(file_path: str) -> str:
    logging.info(f"Loading {file_path} file...")
    with gfile.GFile(name=file_path, mode='rb') as file:
        words_list = pickle.load(file=file)
    file.close()
    return words_list

def store_data(word_count: int, output_file: str):
    logging.info(f"Saving {output_file} file...")
    with gfile.GFile(name=output_file, mode='w') as file:
        file.write(word_count)
    file.close()

# Main -----------------------------------------------------------------------------------------------------------------
def run_component(pkl_path: str, word: str, output_file:str):
    logging.info('Initiating Count Words component...')
    try:
        words_list = load_file(file_path=pkl_path)
        word_count = str(run_count_word(words_list=words_list, word=word))
        store_data(word_count=word_count, output_file=output_file)
    except RuntimeError as error:
        logging.info(error)
    else:
        logging.info('Count words component successfully completed!')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Run Cound Words component")

    parser.add_argument('--pkl-path',
                        type=str,
                        required=True,
                        help='Path to store pickle')

    parser.add_argument('--word',
                        type=str,
                        required=True,
                        help='Word to count')

    parser.add_argument('--count-path',
                        type=str,
                        required=True,
                        help='Path to count file')

    args = parser.parse_args()
    input_pkl_path = args.pkl_path
    input_word = args.word
    out_count_path = args.count_path
    run_component(pkl_path=input_pkl_path, word=input_word, output_file=out_count_path)
