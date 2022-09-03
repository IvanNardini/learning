#!/usr/bin/env python
import psutil

def check_cpu_usage(percent):
    usage=psutil.usage()
    return usage < percent

if not check_cpu_usage(75):
    print("ERROR! CPU is overloaded")
else:
    print("Everything ok")
