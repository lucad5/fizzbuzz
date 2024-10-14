using System;

namespace Fizzbuzz
{
  public class Fizzbuzz_program
  {
    static public Dictionary<int, List<string>> CreateFizzBuzzDictionary(Dictionary<int, string> divisors_and_words)
    {
      var fizzbuzz_numbers_and_words = new Dictionary<int, List<string>> {};
      for (int i = 1; i <= 100; i++)
      {
        fizzbuzz_numbers_and_words[i] = new List<String> {};

        foreach(var divisor_and_word_pair in divisors_and_words)
        {

          if (i % divisor_and_word_pair.Key == 0)
          {
              fizzbuzz_numbers_and_words[i].Add(divisor_and_word_pair.Value);
          }

        }

      }

      return fizzbuzz_numbers_and_words;
    }

    static void PrintFizzBuzz(Dictionary<int, List<string>> fizzbuzz_dictionary)
    {
      foreach (var numbers_and_arrays_of_words in fizzbuzz_dictionary)
      {
        Console.Write(numbers_and_arrays_of_words.Key);        
        foreach (var word in numbers_and_arrays_of_words.Value)
        {
          Console.Write(" ");
          Console.Write(word);
        }
        Console.WriteLine();
      }
    }
    static public void Main(string[] args)
    {
      var divisors_and_words = new Dictionary<int, string>()
        {
          {3, "fizz"},
          {5, "buzz"}
        };
      var fizzbuzz_dictionary = CreateFizzBuzzDictionary(divisors_and_words);
      PrintFizzBuzz(fizzbuzz_dictionary);

    }
  }
}