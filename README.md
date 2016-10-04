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

# Minesweeper Kata
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

# Same Arrays Kata
Given two arrays, the purpose of this Kata is to check if these two arrays are the same. "The same" in this Kata means the two arrays contains arrays of 2 numbers which are same and not necessarily sorted the same way. i.e. [[2,5], [3,6]] is same as [[5,2], [3,6]] or [[6,3], [5,2]] or [[6,3], [2,5]] etc

[[2,5], [3,6]] is NOT the same as [[2,3], [5,6]]
Two empty arrays [] are the same
[[2,5], [5,2]] is the same as [[2,5], [2,5]] but NOT the same as [[2,5]]
[[2,5], [3,5], [6,2]] is the same as [[2,6], [5,3], [2,5]] or [[3,5], [6,2], [5,2]], etc
An array can be empty or contain a minimun of one array of 2 integers and up to 100 array of 2 integers
Note:
1. [[]] is not applicable because if the array of array are to contain anything, there have to be two numbers.
2. 100 randomly generated tests that can contains either "same" or "not same" arrays.
