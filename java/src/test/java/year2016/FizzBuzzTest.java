package year2016;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    @Test
    public void calculatesSequenceOfNumbersUpToInputValue() {
        List<String> result = FizzBuzz.calculateSequenceUpTo(2);

        assertThat(result, is(asList("1", "2")));
    }

    @Test
    public void calculatesSequenceWithFizzInsteadOfThree() {
        List<String> result = FizzBuzz.calculateSequenceUpTo(3);

        assertThat(result, is(asList("1", "2", "Fizz")));
    }

    @Test
    public void calculatesSequenceWithBuzzInsteadOfFive() {
        List<String> result = FizzBuzz.calculateSequenceUpTo(5);

        assertThat(result, is(asList("1", "2", "Fizz", "4", "Buzz")));
    }

    @Test
    public void calculatesSequenceWithFizzBuzzInsteadOfFifteen() {
        List<String> result = FizzBuzz.calculateSequenceUpTo(15);

        assertThat(result, is(asList("1", "2", "Fizz", "4", "Buzz",
                                     "Fizz", "7", "8", "Fizz", "Buzz",
                                     "11", "Fizz", "13", "14", "FizzBuzz")));
    }
}
