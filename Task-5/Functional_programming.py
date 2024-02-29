#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 21 19:02:41 2024

@author: nilesh
"""

# First class functions
def add(x, y):
    return x + y

def operate(func, x, y):
    return func(x, y)

result = operate(add, 5, 5)
print(result)

# Lambda Functions
square = lambda x: x * x
print(square(10))

# Map
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
squared = list(map(lambda x: x * x, numbers))
print(squared)

# Filter
even = list(filter(lambda x: x % 2 == 0, numbers))
print(even)

# Reduce
from functools import reduce
product = reduce(lambda x, y: x * y, numbers)
print(product)

# List comprehension
squared = [x * x for x in numbers]
print(squared)

# Generator expression
squared_gen = (x * x for x in numbers)
print(list(squared_gen))

# Immutable tuple
point = (7, 8)
x, y = point
print(x, y)

# Namedtuple
from collections import namedtuple
Point = namedtuple('Point', ['x', 'y'])
point = Point(7, 8)
print(point.x, point.y)


