function determine_fizzbuzz_words_for_each_number(fizzbuzz_numbers, fizzbuzz_range) {

    fizzbuzz_string = "";
    for (i = fizzbuzz_range["min"]; i <= fizzbuzz_range["max"]; i++) {

        fizzbuzz_string = fizzbuzz_string.concat(i, " ");

        for (let number in fizzbuzz_numbers) {
            if (i % number === 0){
                fizzbuzz_string = fizzbuzz_string.concat(fizzbuzz_numbers[number]);
            };
        };
        fizzbuzz_string = fizzbuzz_string.concat("<br />");
    };
    console.log("fizzbuzz string: ", fizzbuzz_string)
    return fizzbuzz_string;
};

const fizzbuzz_divisors_and_words = {3: "fizz", 5: "buzz"};
const fizzbuzz_range = {"min": 1, "max": 100}

determine_fizzbuzz_words_for_each_number(fizzbuzz_divisors_and_words, fizzbuzz_range)

document.getElementById("fizzbuzz_text").innerHTML = determine_fizzbuzz_words_for_each_number(fizzbuzz_divisors_and_words, fizzbuzz_range)