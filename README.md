# Grace Hopper Coding Katas

The katas are organized by language, as well as year

Each of the languages will have the same katas

In each language directory, there is a 2015 and 2016 folder for last years and this years code katas

For the 2016 code katas, the description of the problem is at the top of each class

# Java

You will need gradle and Java 8 installed for these katas

Run tests: ``` gradle test ```

See all gradle tasks: ``` gradle tasks ```

# JavaScript

You will need gulp and node installed for these katas

Download dependencies: ``` npm install ```

To download the gulp cli: ```npm install --global gulp-cli```

Run tests: ``` gulp test ```

See all gulp tasks: ``` gulp help ```

# ruby

You will need ruby and bundle (```gem install bundler```) installed for these katas

``` bundle install```

run tests: ``` rake all_tests```

# 2016 Katas

## Pig Latin Kata

The goal is to convert sentences to sentences in [Pig Latin](https://en.wikipedia.org/wiki/Pig_Latin). Pig Latin is described as follows:

For words that begin with consonants, all letters before the initial vowel are placed at the end of the word sequence. Then, "ay" is added, as in the following examples:
```
"pig" → "igpay"
"banana" → "ananabay"
"trash" → "ashtray"
"happy" → "appyhay"
"duck" → "uckday"
```

For words that begin with a vowel, one just adds "way" to the end. Examples are:
```
"eat" → "eatway"
"omelet" → "omeletway"
"are" → "areway"
```

For sentences the rules apply to each word individually:

```
"Hello how are you?" → "Ellohay owhay areway ouyay?"
```

'qu' should be treated as a single phoneme, ex:

```
"queen" → "eenquay"
"square" → "aresquay"
```

bonus:
  * make sure you maintain capitalization in sentences, but with new letter capitalized
  * ex: "Hello, I am from Canada" -> "Ellohay, Iway amway omfray Anadacay"

## Sum Square Difference Kata

This kata is Problem 6 from Project Euler:

The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. Your programming should be able to give you the difference between the sum of squares for the first 'n' natural numbers.

## Round Robin

We want to write a [Round Robin](https://en.wikipedia.org/wiki/Round-robin_tournament) scheduling app. For example, all teams should be paired together such that:
	* A team is never paired with themselves
	* A team is never paired with another team more than once
	* In the case of an odd number of teams, each team will have a round where they aren't paired with someone,
		in which case it should say "no match"


Given an input of names to be paired together:
```
	input: ["Amber", "Theo", "Beccie", "Ama"]
```

Then we expect an output of a Map containing each person's itinerary:
```
  output: {
			"Amber": ["Theo", "Beccie", "Ama"],
			"Beccie": ["Ama", "Amber", "Theo"],
			"Theo": ["Amber", "Ama", "Beccie"],
			"Ama": ["Beccie", "Theo", "Amber"]
			}
```

For example, each round of matches would be as follows:
```
Round 1
Amber vs Theo
Beccie vs Ama

Round 2
Amber vs Beccie
Ama vs Theo

Round 3
Amber vs Ama
Beccie vs Theo
```

Example of pairing uneven number of teams:
```
	input: ["Amber", "Theo", "Beccie"]
	output: {
			    "Amber": ["Theo", "Beccie", "no match"],
			    "Beccie": ["no match", "Amber", "Theo"],
			    "Theo": ["Amber", "no match", "Beccie"]
			}
```
I would suggest following the ["rotating polygon"](https://nrich.maths.org/1443) method to solve this

# 2015 Katas

## Minesweeper Kata
A field of N x M squares is represented by N lines of
exactly M characters each. The character '*' represents
a mine and the character '.' represents no-mine.

Example input (a 4 x 3 mine-field of 12 squares, 2 of
which are mines)
```
4 3
*...
..*.
....
```

Your task is to write a program to accept this input and
produce as output a hint-field of identical dimensions
where each square is a * for a mine or the number of
adjacent mine-squares if the square does not contain a mine.

Example output (for the above input)
```
*211
12*1
0111
```

## Same Arrays Kata
Given two arrays, the purpose of this Kata is to check if these two arrays are the same. "The same" in this Kata means the two arrays contains arrays of 2 numbers which are same and not necessarily sorted the same way. i.e. [[2,5], [3,6]] is same as [[5,2], [3,6]] or [[6,3], [5,2]] or [[6,3], [2,5]] etc

[[2,5], [3,6]] is NOT the same as [[2,3], [5,6]]
Two empty arrays [] are the same
[[2,5], [5,2]] is the same as [[2,5], [2,5]] but NOT the same as [[2,5]]
[[2,5], [3,5], [6,2]] is the same as [[2,6], [5,3], [2,5]] or [[3,5], [6,2], [5,2]], etc
An array can be empty or contain a minimun of one array of 2 integers and up to 100 array of 2 integers
Note:
1. [[]] is not applicable because if the array of array are to contain anything, there have to be two numbers.
2. 100 randomly generated tests that can contains either "same" or "not same" arrays.
