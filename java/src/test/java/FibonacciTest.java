import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {

	@Ignore
	@Test
	public void shouldReturnAnArrayWithTheListOfNumbersInThatSequence() {
		Fibonacci fibonacci = new Fibonacci();
		ArrayList<Integer> sequence = fibonacci.forNumber(5);
		assertEquals(Integer.valueOf(1), sequence.get(0));
	}
}