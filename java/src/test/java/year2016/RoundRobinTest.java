package year2016;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoundRobinTest {

    @Test
    public void pairsASingleTeamWithNoOne() {
        Map<String, List<String>> teamItineraries = RoundRobin.generateSchedule(asList("Toronto Raptors"));

        Map<String, List<String>> expectedTeamItineraries = new HashMap<>();
        expectedTeamItineraries.put("Toronto Raptors", asList("no match"));

        assertThat(teamItineraries, is(expectedTeamItineraries));
    }

    @Test
    public void pairsTwoTeamsWithEachOther() {
        Map<String, List<String>> teamItineraries = RoundRobin.generateSchedule(asList("Toronto Raptors", "Chicago Bulls"));

        Map<String, List<String>> expectedTeamItineraries = new HashMap<>();
        expectedTeamItineraries.put("Toronto Raptors", asList("Chicago Bulls"));
        expectedTeamItineraries.put("Chicago Bulls", asList("Toronto Raptors"));

        assertThat(teamItineraries, is(expectedTeamItineraries));
    }


    @Test
    public void pairsMultipleTeamsWithEachOtherWhenThereAreAnEvenNumberOfTeams() {
        List<String> listOfTeams = asList("Toronto Raptors", "Chicago Bulls", "LA Lakers", "Philadelphia 76ers", "Houston Rockets", "New York Knicks");

        Map<String, List<String>> teamItineraries = RoundRobin.generateSchedule(listOfTeams);

        Map<String, List<String>> expectedTeamItineraries = new HashMap<>();
        expectedTeamItineraries.put("Toronto Raptors", asList("New York Knicks", "Chicago Bulls", "LA Lakers", "Philadelphia 76ers", "Houston Rockets"));
        expectedTeamItineraries.put("Chicago Bulls", asList("Houston Rockets", "Toronto Raptors", "Philadelphia 76ers", "New York Knicks", "LA Lakers"));
        expectedTeamItineraries.put("LA Lakers", asList("Philadelphia 76ers", "New York Knicks", "Toronto Raptors", "Houston Rockets", "Chicago Bulls"));
        expectedTeamItineraries.put("Philadelphia 76ers", asList("LA Lakers", "Houston Rockets", "Chicago Bulls", "Toronto Raptors", "New York Knicks"));
        expectedTeamItineraries.put("Houston Rockets", asList("Chicago Bulls", "Philadelphia 76ers", "New York Knicks", "LA Lakers", "Toronto Raptors"));
        expectedTeamItineraries.put("New York Knicks", asList("Toronto Raptors", "LA Lakers", "Houston Rockets", "Chicago Bulls", "Philadelphia 76ers"));

        assertThat(teamItineraries, is(expectedTeamItineraries));
    }

}