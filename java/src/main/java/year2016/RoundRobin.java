package year2016;

import java.util.List;
import java.util.Map;

/*

https://en.wikipedia.org/wiki/Round-robin_tournament

I would suggest following the "rotating polygon" method to solve this
https://nrich.maths.org/1443

Example implementation in Ruby: https://github.com/ethome/roundrobin

We want to write a Round Robin scheduling app. For example, all teams should be paired together such that:
	- A team is never paired with themselves
	- A team is never paired with another team more than once
	- In the case of an odd number of teams, each team will have a round where they aren't paired with someone,
		in which case it should say "no match"


Given an input of names to be paired together:
	input: ["Amber", "Theo", "Beccie", "Ama"]

Then we expect an output of a Map containing each person's itinerary:
	output: {
			"Amber": ["Theo", "Beccie", "Ama"],
			"Beccie": ["Ama", "Amber", "Theo"],
			"Theo": ["Amber", "Ama", "Beccie"],
			"Ama:" ["Beccie", "Theo", "Amber"]
			}

For example, each round of matches would be as follows:

Round 1
Amber vs Theo
Beccie vs Ama

Round 2
Amber vs Beccie
Ama vs Theo

Round 3
Amber vs Ama
Beccie vs Theo

Example of pairing uneven number of teams:
	input: ["Amber", "Theo", "Beccie"]
	output: {
			    "Amber": ["Theo", "Beccie", "no match"],
			    "Beccie": ["no match", "Amber", "Theo"],
			    "Theo": ["Amber", "no match", "Beccie"]
			}

 */

public class RoundRobin {

    public static Map<String, List<String>> generateSchedule(List<String> teams) {
        return null;
    }
}