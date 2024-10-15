using Xunit;
using Fizzbuzz;
using Microsoft.VisualStudio.TestPlatform.TestHost;
using System.Linq.Expressions;

namespace FizzBuzz_tests;

public class UnitTest1
{

    [Fact]
    public void Test1()
    {
        var Fizzbuzz_program = new Fizzbuzz_program();
          var divisors_and_words = new Dictionary<int, string>()
        {
          {3, "fizz"},
          {5, "buzz"}
        };
        var dictionary = Fizzbuzz_program.CreateFizzBuzzDictionary(divisors_and_words);
        foreach (var number_word_pair in dictionary)
        {
            int word_exists_for_number = 0;
            foreach (var divisor_word_pair in divisors_and_words)
            {
                if (number_word_pair.Key % divisor_word_pair.Key == 0)
                {
                    Assert.Contains(divisor_word_pair.Value, number_word_pair.Value);
                    word_exists_for_number = 1;
                }

                else if (number_word_pair.Key % divisor_word_pair.Key != 0)
                {
                    Assert.DoesNotContain(divisor_word_pair.Value, number_word_pair.Value);
                }
            }


            if (word_exists_for_number == 0)
            {
                Assert.Empty(number_word_pair.Value);
            }
        }

    }
}