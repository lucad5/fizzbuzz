possible_divisors = {}
possible_divisors[3] = "fizz"
possible_divisors[5] = "buzz"

for i in range(1, 100):
    print(i, end="")

    divisors_of_current_number = []

    # See if any 
    for divisor in possible_divisors:
        if i % divisor == 0:
            divisors_of_current_number.append(divisor)

    divisors_of_current_number.sort()

    if not divisors_of_current_number:
        print("\n")
        continue

    else:
        print(" ", end="")
        for divisor in divisors_of_current_number:
            print(possible_divisors[divisor], end="")
        print("\n")


