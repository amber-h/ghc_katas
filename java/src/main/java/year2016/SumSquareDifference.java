package year2016;

/*
Project Euler Problem 6

The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */

public class SumSquareDifference {

    public static int findDifference(int number) {
        int sum = 0;
        int sumOfSquares = 0;

        for(int i = 0; i <= number; i++) {
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }
        int squareOfSum = (int) Math.pow(sum, 2);

        return squareOfSum - sumOfSquares;
    }

}