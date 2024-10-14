using Xunit;
using Fizzbuzz;
using Microsoft.VisualStudio.TestPlatform.TestHost;

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
        Assert.True(3 == 5);
        foreach (var number_word_pair in dictionary)
        {
            foreach (var divisor_word_pair in divisors_and_words)
            {
                Assert.True(number_word_pair.Value.Contains(divisor_word_pair.Value));

                if (number_word_pair.Key % divisor_word_pair.Key == 0)
                {
                    Assert.True(number_word_pair.Value.Contains(divisor_word_pair.Value));
                }
            }
        }

    }
}