package year2016;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumSquareDifferenceTest {

    @Test
    public void findsSumSquareDifferenceOf0() {
        int actualDifference = SumSquareDifference.findDifference(0);

        assertThat(actualDifference, is(0));
    }

    @Test
    public void findsSumSquareDifferenceOf2() {
        int actualDifference = SumSquareDifference.findDifference(2);

        assertThat(actualDifference, is(4));
    }

    @Test
    public void findsSumSquareDifferenceOf10() {
        int actualDifference = SumSquareDifference.findDifference(10);

        assertThat(actualDifference, is(2640));
    }

}