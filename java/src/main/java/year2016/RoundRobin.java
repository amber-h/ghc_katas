package year2016;/*

https://en.wikipedia.org/wiki/Pig_Latin

For words that begin with consonant sounds, all letters before the initial vowel are placed at the end of the word sequence. Then, "ay" (some people just add "a") is added, as in the following examples:

"pig" → "igpay"
"banana" → "ananabay"
"trash" → "ashtray"
"happy" → "appyhay"
"duck" → "uckday"

For words that begin with vowel sounds, one just adds "way" to the end. Examples are:

"eat" → "eatway"
"omelet" → "omeletway"
"are" → "areway"

For sentences the rules apply to each word individually:

"Hello how are you?" → "Ellohay owhay areway ouyay?"

Treats 'qu' as a single phoneme, ex:

"queen" → "eenquay"
"square" → "aresquay"

bonus:
  * make sure you maintain capitalization in sentences, but with java.new letter capitalized
  * ex: "Hello, I am from Canada" -> "Ellohay, Iway amway omfray Anadacay"

 */

import java.util.List;
import java.util.Map;

/*

https://en.wikipedia.org/wiki/Round-robin_tournament
https://nrich.maths.org/1443

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

    public static Map<String, List<String>> generateSchedule(List<String> names) {
        return null;
    }
}