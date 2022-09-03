#!/usr/bin/env python3

import shutil
import logging

logging.basicConfig(format='%(asctime)s %(levelname)s %(message)s', datefmt='%m/%d/%Y %I:%M:%S %p', level=logging.ERROR)

def check_disk_usage(disk, min_abs, min_perc):
  """Returns True if there is enough free disk space, false otherwise"""
  du = shutil.disk_usage(disk)
  #Calculate the percent of free space
  percent_free = 100 * du.free / du.total
  #Calculate how many free gigabytes
  gigabytes_free = du.free / 2**30
  if percent_free < min_perc or gigabytes_free < min_abs:
    return False
  return True

#Check for at least 2GB and 10% free
if not check_disk_usage("/", 2*2**30, 10):
  logging.error("Not enough disk space")
  return 1
logging.info("Everything ok!")
return 0


