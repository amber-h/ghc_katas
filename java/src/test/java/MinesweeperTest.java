import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class MinesweeperTest {

    @Test
    public void shouldReturnMapWithOneMine() {
        Minesweeper arrayTester = new Minesweeper("*..");
        assertEquals("*", arrayTester.solve());
    }

    @Ignore
    @Test
    public void shouldReturnMapWithOneMineAndIndicatingTheAdjacentSpace() {
        Minesweeper arrayTester = new Minesweeper("*.");
        assertEquals("*1", arrayTester.solve());
    }

    @Ignore
    @Test
    public void shouldReturnMapWithOneMineAndOneAdjacentAndOneNotNearMines() {
        Minesweeper arrayTester = new Minesweeper("*..");
        assertEquals("*10", arrayTester.solve());
    }

    @Ignore
    @Test
    public void shouldReturnMapWithTwoLinesAndOneMine() {
        Minesweeper arrayTester = new Minesweeper("*..\n...");
        assertEquals("*10\n110", arrayTester.solve());
    }

    @Ignore
    @Test
    public void shouldReturnMapWithTwoLinesAndMultipleMines() {
        Minesweeper arrayTester = new Minesweeper("*..\n.*.");
        assertEquals("*21\n221", arrayTester.solve());
    }

    @Ignore
    @Test
    public void shouldReturnMapWithThreeLines() {
        Minesweeper arrayTester = new Minesweeper("*..\n..*\n...");
        assertEquals("*11\n121\n011", arrayTester.solve());
    }

    @Ignore
    @Test(expected = InputMismatchException.class)
    public void shouldThrowAnExceptionForInvalidInput() {
        new Minesweeper("jibberish");
    }

    @Ignore
    @Test
    public void shouldReturnAMapWithUnevenLines() {
        Minesweeper arrayTester = new Minesweeper("*..**\n..*\n........*");
        assertEquals("*12**\n12*\n01221001*", arrayTester.solve());
    }
}