import org.junit.Before;
import org.junit.Test;
import samearrays.DoubleArray;
import samearrays.SameArrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SameArraysTest {

    SameArrays arrayTester;

    @Before
    public void setUp() throws Exception {
        arrayTester = new SameArrays();
    }


    @Test
    public void shouldReturnTrueWhenArraysHaveDifferentOrdering() {
        Integer[] one = new Integer[]{2, 5};
        Integer[] two = new Integer[]{3, 6};
        DoubleArray firstList = new DoubleArray(new Integer[][]{one, two});

        Integer[] three = new Integer[]{3, 6};
        Integer[] four = new Integer[]{5, 2};
        DoubleArray secondList = new DoubleArray(new Integer[][]{three, four});

        assertTrue(arrayTester.isSame(firstList, secondList));
    }

    @Test
    public void shouldReturnFalseIfArraysHaveDifferentNumber() {
        Integer[] one = new Integer[]{2, 5};
        Integer[] two = new Integer[]{3, 6};
        DoubleArray firstList = new DoubleArray(new Integer[][]{one, two});

        Integer[] three = new Integer[]{2, 3};
        Integer[] four = new Integer[]{5, 6};
        DoubleArray secondList = new DoubleArray(new Integer[][]{three, four});

        assertFalse(arrayTester.isSame(firstList, secondList));
    }

    @Test
    public void shouldReturnTrueWhenCheckingTwoEmptyArrays() {
        DoubleArray firstList = new DoubleArray(new Integer[][]{});

        DoubleArray secondList = new DoubleArray(new Integer[][]{});
        assertTrue(arrayTester.isSame(firstList, secondList));
    }


    @Test
    public void shouldReturnTrueIfThereAreSameNumberOfArrays() {
        Integer[] one = new Integer[]{2, 5};
        Integer[] two = new Integer[]{3, 6};
        DoubleArray firstList = new DoubleArray(new Integer[][]{one, two});

        Integer[] three = new Integer[]{5, 2};
        Integer[] four = new Integer[]{3, 6};
        DoubleArray secondList = new DoubleArray(new Integer[][]{three, four});
        assertTrue(arrayTester.isSame(firstList, secondList));
    }

    @Test
    public void shouldReturnFalseIfThereAreDifferentNumberOfArrays() {
        Integer[] one = new Integer[]{2, 5};
        Integer[] two = new Integer[]{3, 6};
        DoubleArray firstList = new DoubleArray(new Integer[][]{one, two});

        Integer[] three = new Integer[]{5, 2};
        DoubleArray secondList = new DoubleArray(new Integer[][]{three});
        assertFalse(arrayTester.isSame(firstList, secondList));
    }

    @Test
    public void shouldSortArrays() {
        Integer[] one = new Integer[]{3, 5};
        Integer[] two = new Integer[]{2, 6};
        DoubleArray doubleArray = new DoubleArray(new Integer[][]{one, two});

        Integer[] added = arrayTester.addAll(doubleArray);
        assertThat(added, is(new Integer[]{8, 8}));
    }


}