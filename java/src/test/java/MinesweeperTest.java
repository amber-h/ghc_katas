import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class MinesweeperTest {

	@Ignore
	@Test
	public void shouldReturnTrueWhenCheckingTwoEmptyArrays() {
		Minesweeper arrayTester = new Minesweeper("*..");
		assertEquals("*10", arrayTester.solve());
	}
}