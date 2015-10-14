import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void shouldReturn1Forfirst() {
        Fibonacci fibonacci = new Fibonacci();
        Integer fibonacciNumber = fibonacci.fibonacciLoop(1);

        assertThat(fibonacciNumber, is(1));
    }

    @Test
    public void shouldReturn1ForSecond() {
        Fibonacci fibonacci = new Fibonacci();
        Integer fibonacciNumber = fibonacci.fibonacciLoop(2);

        assertThat(fibonacciNumber, is(1));
    }

    @Test
    public void shouldReturn2ForThird() {
        Fibonacci fibonacci = new Fibonacci();
        Integer fibonacciNumber = fibonacci.fibonacciLoop(3);

        assertThat(fibonacciNumber, is(2));
    }

    @Test
    public void shouldReturn610ForFifteenth() {
        Fibonacci fibonacci = new Fibonacci();
        Integer fibonacciNumber = fibonacci.fibonacciLoop(15);

        assertThat(fibonacciNumber, is(610));
    }

    @Test
    public void should() {
        Fibonacci fibonacci = new Fibonacci();
        final ArrayList<Integer> integers = fibonacci.forNumber(15);

        assertThat(integers.size(), is(15));
        assertThat(integers.get(0), is(1));
        assertThat(integers.get(14), is(610));

    }

}