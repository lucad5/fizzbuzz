def determine_fizzbuzz_divisors_of_current_number(current_number, fizzbuzz_divisors, words_to_print_after_current_number):

    for word in fizzbuzz_divisors:
        if current_number % fizzbuzz_divisors[word] == 0:
            words_to_print_after_current_number.append(word)

    return words_to_print_after_current_number

def determine_fizzbuzz_numbers(number_range):

    fizzbuzz_divisors = {"fizz": 3, "buzz": 5}

    numbers_with_fizz_or_buzz = {}

    for current_number in number_range:

        words_to_print_after_current_number = []
        words_to_print_after_current_number = determine_fizzbuzz_divisors_of_current_number(current_number, fizzbuzz_divisors, words_to_print_after_current_number)

        if not words_to_print_after_current_number:
            numbers_with_fizz_or_buzz[current_number] = []
            continue

        else:
            numbers_with_fizz_or_buzz[current_number] = words_to_print_after_current_number

    return numbers_with_fizz_or_buzz

def print_fizzbuzz(fizzbuzz_numbers):

    for current_number in fizzbuzz_numbers:
        if not fizzbuzz_numbers[current_number]:
            print(current_number)
        else:
            string_to_print_after_number = ""
            for word in fizzbuzz_numbers[current_number]:
                    string_to_print_after_number += word

            print(current_number, string_to_print_after_number)

if __name__ == "__main__":

    number_range = range(1, 101)

    fizzbuzz_numbers = determine_fizzbuzz_numbers(number_range)

    print_fizzbuzz(fizzbuzz_numbers)



