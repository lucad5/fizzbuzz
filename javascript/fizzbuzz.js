function determine_fizzbuzz_numbers_and_words_for_each_number(fizzbuzz_numbers, fizzbuzz_range) {

    fizzbuzz_numbers_and_words = {}

    for (i = fizzbuzz_range["min"]; i <= fizzbuzz_range["max"]; i++) {

        fizzbuzz_numbers_and_words[i] = []

        for (let number in fizzbuzz_numbers) {
            if (i % number === 0){
                fizzbuzz_numbers_and_words[i].push(fizzbuzz_numbers[number])
            };
        };
    };
    return fizzbuzz_numbers_and_words;
};

function fizzbuzz_numbers_and_words_to_string (fizzbuzz_numbers_and_words) {
    fizzbuzz_string = "";

    for (let number in fizzbuzz_numbers_and_words) {

        fizzbuzz_string = fizzbuzz_string.concat(number);

        if (fizzbuzz_numbers_and_words[number].length > 0) {
            fizzbuzz_string = fizzbuzz_string.concat(" ");
            for (let word in fizzbuzz_numbers_and_words[number]) {
                fizzbuzz_string = fizzbuzz_string.concat(fizzbuzz_numbers_and_words[number][word]);
            };
        };
        fizzbuzz_string = fizzbuzz_string.concat("<br />");
    };
    return fizzbuzz_string;
}

const fizzbuzz_divisors_and_words = {3: "fizz", 5: "buzz"};
const fizzbuzz_range = {"min": 1, "max": 100}

fizzbuzz_numbers_and_words = determine_fizzbuzz_numbers_and_words_for_each_number(fizzbuzz_divisors_and_words, fizzbuzz_range)

document.getElementById("fizzbuzz_text").innerHTML = fizzbuzz_numbers_and_words_to_string(fizzbuzz_numbers_and_words)