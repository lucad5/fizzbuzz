# TODO Pytest tests for the Python implementation of fizzbuzz

import pytest
import os
import sys

import fizzbuzz

@pytest.fixture
def fizzbuzz_divisors():
    
    return {"fizz": 3, "buzz": 5}


def test_determine_fizzbuzz_numbers(fizzbuzz_divisors):

    numbers_with_fizz_or_buzz = fizzbuzz.determine_fizzbuzz_numbers(range(1, 101))
    
    for i in range(1, len(numbers_with_fizz_or_buzz)+1):
        for word in fizzbuzz_divisors:
            if i % fizzbuzz_divisors[word] == 0:
               assert word in numbers_with_fizz_or_buzz[i]