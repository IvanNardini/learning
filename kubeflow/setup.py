#!/usr/bin/env python3
from setuptools import setup, find_packages

setup(name='hellokubeflow',
      extras_required=dict(tests=['pytest']),
      packages=find_packages(where='pipelines'),
      package_dir={"": "pipelines"})
