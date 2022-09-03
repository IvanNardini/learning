#!/usr/bin/env python3

import psutil
import logging 

logging.basicConfig(format='%(asctime)s %(levelname)s %(message)s', datefmt='%m/%d/%Y %I:%M:%S %p', level=logging.ERROR)

def check_cpu_usage(percent):
  usage = psutil.cpu_percent()
  return usage < percent

if not check_cpu_usage(75):
  logging.error("CPU is overloaded")
else:
  logging.info("Everything is ok!")

 
