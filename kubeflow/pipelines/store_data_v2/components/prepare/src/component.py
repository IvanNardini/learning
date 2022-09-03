#!/usr/bin/env python3

# component.py
# component is a simple component wrapper of data processing step
# Notice: In this case I assume to read data from Cloud Storage.
# You have both pure storage APIs or tf. gfile.
# For portability, I prefer tf.gfile because you can debug your model
# locally and train it on cloud without changing a single line.

from tensorflow.io import gfile
from prepare import run_prepare
import pickle
import logging
import argparse

# Settings
logging.basicConfig(format='%(asctime)s %(levelname)s %(message)s',
                    datefmt='%m/%d/%Y %I:%M:%S %p',
                    level=logging.DEBUG)


# Helpers --------------------------------------------------------------------------------------------------------------
def load_file(file_path: str) -> str:
    logging.info(f"Loading {file_path} file...")
    with gfile.GFile(name=file_path, mode='r') as file:
        text = file.read().replace("\n", " ")
    file.close()
    return text


def store_data(word_list: list, out_path_pkl: str):
    logging.info(f"Saving {out_path_pkl} pickle file...")
    with gfile.GFile(name=out_path_pkl, mode='w') as file:
        pickle.dump(word_list, file)


# Main -----------------------------------------------------------------------------------------------------------------
def run_component(text_path:str, out_path_pkl:str):
    logging.info('Initiating Data Preparation component...')
    try:
        text = load_file(file_path=text_path)
        token_text = run_prepare(text)
        store_data(word_list=token_text,
                   out_path_pkl=out_path_pkl)
    except RuntimeError as error:
        logging.info(error)
    else:
        logging.info('Data Preparation component successfully completed!')
    return out_path_pkl


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Run Prepare component")

    parser.add_argument('--text-path',
                        type=str,
                        required=True,
                        help='Path of text to process')

    parser.add_argument('--pkl-path',
                        type=str,
                        required=True,
                        help='Path to store pickle')

    args = parser.parse_args()
    text_path = args.text_path
    out_path_pkl = args.pkl_path
    run_component(text_path=text_path,
                  out_path_pkl=out_path_pkl)
