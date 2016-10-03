package year2016;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoundRobinTest {

    @Test
    public void returnsASinglePersonPairedWithThemselves() {
        RoundRobin.generateSchedule(asList("Ama"));
    }
}