import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private int[] range;
    private HashMap<Integer, String[]> divisors_and_words = new HashMap<>();

    @BeforeEach
    void setup() {
        range = new int[] {1, 100};
        divisors_and_words.put(3, new String[]{"fizz"});
        divisors_and_words.put(5, new String[]{"buzz"});
    }

    @Test
    void test_fizzbuzz_hashmap_is_correct_length() {

        assertEquals(range[1], Main.determine_fizzbuzz_words(range, divisors_and_words).size());
    }
/*
    @Test
    void test_fizzbuzz_words_hashmap_contains_correct_numbers_and_words() {


        HashMap<Integer, List> fizzbuzz_numbers_and_words = Main.determine_fizzbuzz_words(range, divisors_and_words);

        for (int current_number_in_hashmap = range[0]; current_number_in_hashmap < range[1]; current_number_in_hashmap++) {

            for (int current_number = range[0]; current_number < range[1]; current_number++) {
                assertEquals(current_number, fizzbuzz_numbers_and_words)
            }
        }
        assertEquals(fizzbuzz_numbers_and_words, Main.determine_fizzbuzz_words(range, divisors_and_words));
    }

    @Test
    void test_fizzbuzz_string_is_correct() {

    }
*/
}