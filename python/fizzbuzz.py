
#def print_current_line(possible_divisors):

def determine_divisors_of_current_number(current_number, possible_divisors, divisors_of_current_number):

    for divisor in possible_divisors:
        if current_number % divisor == 0:
            divisors_of_current_number.append(divisor)

    return divisors_of_current_number

possible_divisors = {}
possible_divisors[3] = "fizz"
possible_divisors[5] = "buzz"


for i in range(1, 100):
    print(i, end=" ")

    divisors_of_current_number = []
    divisors_of_current_number = determine_divisors_of_current_number(i, possible_divisors, divisors_of_current_number)

    divisors_of_current_number.sort()

    if not divisors_of_current_number:
        print("\n")
        continue

    else:
        for divisor in divisors_of_current_number:
            print(possible_divisors[divisor], end="")
        print("\n")


