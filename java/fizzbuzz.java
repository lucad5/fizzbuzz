import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class fizzbuzz {

    static HashMap<Integer, List> determine_fizzbuzz_words(int[] range, HashMap<Integer, String[]> divisors_and_words) {

        HashMap<Integer, List> fizzbuzz_words = new HashMap<Integer, List>();

        int range_min = range[0];
        int range_max = range[1];

        for (int current_number = range_min; current_number <= range_max; current_number++) {
            // TODO: Fill out this function
            //    System.out.print(i);

            List<Integer> divisors_of_current_number = new ArrayList();

            for (int divisor : divisors_and_words.keySet()) {
                if (current_number % divisor == 0) {
                    divisors_of_current_number.add(divisor);
                }

            // TODO: add integers (i) in the range and the words for each integer to the array fizzbuzz_words
            }

            List word_array = new ArrayList<String>();

            for (int divisor : divisors_of_current_number) {
                
                String[] words = divisors_and_words.get(divisor);

//                for (int word_index; word_index < divisors_and_words.length; word_index++) {
                for (String word : words) {
                    word_array.add(word);
                }

            }

            fizzbuzz_words.put(current_number, word_array);
            System.out.print(fizzbuzz_words);

        }

        return fizzbuzz_words;
    }

    public static void main(String[] args) {
        // TODO: modify the for loop to use maps
        
        int[] range = {1, 100};
        HashMap<Integer, String[]> divisors_and_words = new HashMap<>();
        divisors_and_words.put(3, new String[]{"fizz"});
        divisors_and_words.put(5, new String[]{"buzz"});

        HashMap<Integer, List> fizzbuzz_numbers_and_words = new HashMap<>();
        fizzbuzz_numbers_and_words = determine_fizzbuzz_words(range, divisors_and_words);

//        String[] words = {"fizz"};
//        numbers_and_words.put(1, words);
//        String[] word = numbers_and_words.get(1);
/*
        for (int i = 1; i <= 100; i++)
        {
            System.out.print(i);
            System.out.print(" ");

            if (i % 3 == 0)
            {
                System.out.print("fizz");
            }

            if (i % 5 == 0)
            {
                System.out.print("buzz");
            }

            System.out.print("\n");
        }
 */
    }
}