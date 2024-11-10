import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static HashMap<Integer, List> determine_fizzbuzz_words(int[] range, HashMap<Integer, String[]> divisors_and_words) {

        HashMap<Integer, List> fizzbuzz_words = new HashMap<Integer, List>();

        int range_min = range[0];
        int range_max = range[1];

        for (int current_number = range_min; current_number <= range_max; current_number++) {

            List<Integer> divisors_of_current_number = new ArrayList();

            for (int divisor : divisors_and_words.keySet()) {
                if (current_number % divisor == 0) {
                    divisors_of_current_number.add(divisor);
                }

            }

            List word_array = new ArrayList<String>();

            for (int divisor : divisors_of_current_number) {

                String[] words = divisors_and_words.get(divisor);

                for (String word : words) {
                    word_array.add(word);
                }

            }

            fizzbuzz_words.put(current_number, word_array);
//            System.out.print(fizzbuzz_words);

        }

        return fizzbuzz_words;
    }

    static String convert_fizzbuzz_words_to_string(HashMap<Integer, List> fizzbuzz_numbers_and_words) {

        String string_of_all_numbers_plus_words = "";

        for (int number : fizzbuzz_numbers_and_words.keySet()) {
            string_of_all_numbers_plus_words += number;

            List<String> words_for_current_number = fizzbuzz_numbers_and_words.get(number);

            if (words_for_current_number.size() != 0) {
                string_of_all_numbers_plus_words += " ";
                for (String word : words_for_current_number) {
                    string_of_all_numbers_plus_words += word;
                }
            }

            string_of_all_numbers_plus_words += "\n";
        }

        return string_of_all_numbers_plus_words;
    }

    public static void main(String[] args) {

        int[] range = {1, 100};
        HashMap<Integer, String[]> divisors_and_words = new HashMap<>();
        divisors_and_words.put(3, new String[]{"fizz"});
        divisors_and_words.put(5, new String[]{"buzz"});

        HashMap<Integer, List> fizzbuzz_numbers_and_words = new HashMap<>();
        fizzbuzz_numbers_and_words = determine_fizzbuzz_words(range, divisors_and_words);

        System.out.print(convert_fizzbuzz_words_to_string(fizzbuzz_numbers_and_words));

    }
}