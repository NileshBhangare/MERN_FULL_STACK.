#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 21 18:54:22 2024

@author: nilesh
"""

try:
    # Attempt to open a file that does not exist
    f = open("AutoInsurance.csv", "r")
except FileNotFoundError:
    print("File not found.")
except Exception as e:
    print("An error occurred:", e)
