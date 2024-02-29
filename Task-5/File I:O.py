#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 21 19:04:21 2024

@author: nilesh
"""

# Writing to a file
with open("Nilesh.txt", "w") as f:
    f.write("Hello, world!")

# Reading from a file
with open("Nilesh.txt", "r") as f:
    content = f.read()
    print(content)  # Output: Hello, world!
