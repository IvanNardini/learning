#!/usr/bin/env python3

# count.py
# count is a simple example of processing

import pickle
import argparse
import logging

# Settings
logging.basicConfig(format='%(asctime)s %(levelname)s %(message)s',
                    datefmt='%m/%d/%Y %I:%M:%S %p',
                    level=logging.DEBUG)


# Function -------------------------------------------------------------------------------------------------------------

def count_word(words_list: list, word: str) -> int:
    return words_list.count(word)


# Main -----------------------------------------------------------------------------------------------------------------
def run_count_word(words_list: list, word: str):
    logging.info("Count words processing starts...")
    try:
        logging.info("Counting...")
        n_word = count_word(words_list=words_list, word=word)
    except RuntimeError as error:
        logging.info(error)
    else:
        logging.info("Count words processing successfully completed!")
    return n_word


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Run Cound Words processing")

    parser.add_argument('--word-list',
                        required=True,
                        help='A list of words')

    parser.add_argument('--word',
                        required=True,
                        help='The word to count occurrences')

    args = parser.parse_args()
    input_word_list = args.word_list
    input_word = args.word
    run_count_word(words_list=input_word_list, word=input_word)
