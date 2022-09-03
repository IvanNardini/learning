#!/usr/bin/env python3

# prepare.py
# prepare is a simple example of data preparation component

import nltk
import argparse
import logging

# Function -------------------------------------------------------------------------------------------------------------
def prepare_data(text: str) -> list:
    tokenizer = nltk.RegexpTokenizer(r"\w+")
    plain_text = tokenizer.tokenize(text=text)
    return plain_text

# Main -----------------------------------------------------------------------------------------------------------------
def run_prepare(text: str):
    logging.info("Tokenizing the text...")
    try:
        token_text = prepare_data(text=text)
    except RuntimeError as error:
        logging.info(error)
    else:
        logging.info("Text successfully tokenized!")
    return token_text


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Run Prepare processing")
    parser.add_argument('--text',
                        type=str,
                        required=True,
                        help='Text to process')
    args = parser.parse_args()
    run_prepare(text=args.text)
