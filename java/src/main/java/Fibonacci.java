import java.util.ArrayList;

public class Fibonacci {
    public Fibonacci() {

    }

    public ArrayList<Integer> forNumber(Integer sequenceMaximum) {
        ArrayList<Integer> fibonacci = new ArrayList<>();

        for (int i = 0; i < sequenceMaximum; i++) {
            fibonacci.add(fibonacciLoop(i+1));
        }

        return fibonacci;

    }

    public Integer fibonacciLoop(Integer index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        int firstFibo = 1, secondFibo = 1;
        int sum = 0;
        for (int i = 3; i <= index; i++) {
            //Fibonacci number is sum of previous two Fibonacci number
            sum = firstFibo + secondFibo;
            firstFibo = secondFibo;
            secondFibo = sum;

        }
        return sum;
    }
}