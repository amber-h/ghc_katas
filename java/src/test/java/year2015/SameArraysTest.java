package year2015;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert.*;

public class SameArraysTest {
	@Test
	public void shouldReturnTrueWhenCheckingTwoEmptyArrays() {
		SameArrays arrayTester = new SameArrays();
		arrayTester.checkEquality(new ArrayList(), new ArrayList());
	}
}