#!/usr/bin/env python3

# wordcount_minimal.py
# wordcount_minimal is the quick start from apache beam documentation
# (https://beam.apache.org/get-started/wordcount-example/#minimalwordcount-example)
# Key steps:
# Creating the Pipeline
# Applying transforms to the Pipeline
# Reading input (in this example: reading text files)
# Applying ParDo transforms
# Applying SDK-provided transforms (in this example: Count)
# Writing output (in this example: writing to a text file)
# Running the Pipeline

import apache_beam as beam
from apache_beam.options.pipeline_options import PipelineOptions, DirectOptions

# VARIABLES
pipeline_opts = PipelineOptions()
direct_runner_options = pipeline_opts.view_as(DirectOptions)

if __name__ == '__main__':
    print(pipeline_opts.get_all_options())