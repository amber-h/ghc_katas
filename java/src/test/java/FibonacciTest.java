import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@Ignore
public class FibonacciTest {

    @Test
    public void shouldReturnAnEmptyArrayForZero() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> sequence = fibonacci.forNumber(0);
        assertEquals(0, sequence.size());
    }

    @Test
    public void shouldReturnAnArrayOfOne() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> sequence = fibonacci.forNumber(1);
        assertEquals(1, sequence.size());
        assertEquals(Integer.valueOf(1), sequence.get(0));
    }

    @Test
    public void shouldReturnAnArrayWithTheFirst3Numbers() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> sequence = fibonacci.forNumber(3);
        assertEquals(Integer.valueOf(1), sequence.get(0));
        assertEquals(Integer.valueOf(1), sequence.get(1));
        assertEquals(Integer.valueOf(2), sequence.get(2));
    }

    @Test
    public void shouldReturnAnArrayWithTheFirstFiveNumbers() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> sequence = fibonacci.forNumber(5);
        assertEquals(Integer.valueOf(1), sequence.get(0));
        assertEquals(Integer.valueOf(1), sequence.get(1));
        assertEquals(Integer.valueOf(2), sequence.get(2));
        assertEquals(Integer.valueOf(3), sequence.get(3));
        assertEquals(Integer.valueOf(5), sequence.get(4));
    }

    @Test
    public void shouldReturnAnArrayWithTheListOfTheFirstTenNumbers() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> sequence = fibonacci.forNumber(10);
        assertEquals(10, sequence.size());
        assertEquals(Integer.valueOf(1), sequence.get(0));
        assertEquals(Integer.valueOf(1), sequence.get(1));
        assertEquals(Integer.valueOf(2), sequence.get(2));
        assertEquals(Integer.valueOf(3), sequence.get(3));
        assertEquals(Integer.valueOf(5), sequence.get(4));
    }
}