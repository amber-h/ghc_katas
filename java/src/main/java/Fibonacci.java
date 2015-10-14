import java.util.ArrayList;

public class Fibonacci {
	public Fibonacci() {
		
	}
	
	public ArrayList<Integer> forNumber(Integer sequenceMaximum) {
		ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
        if(sequenceMaximum == 0) {
            return fibonacciSequence;
        }

        Integer fibonacciSequenceStarter = 1;
        if(sequenceMaximum >= 1) {
            fibonacciSequence.add(fibonacciSequenceStarter);
        }

        sequenceMaximum = sequenceMaximum - 1;
        return getSequence(fibonacciSequence, sequenceMaximum);
	}

    private ArrayList<Integer> getSequence(ArrayList<Integer> currentSequence, int numberInSequence) {
        if(numberInSequence == 0) {return currentSequence; }

        int currentSequenceSize = currentSequence.size();
        if(currentSequenceSize == 1) {
            currentSequence.add(1);
        } else {
            Integer secondToLastNumber = currentSequence.get(currentSequenceSize - 2);
            Integer lastNumber = currentSequence.get(currentSequenceSize - 1);
            currentSequence.add(secondToLastNumber + lastNumber);
        }

        numberInSequence = numberInSequence - 1;
        return getSequence(currentSequence, numberInSequence);
    }
}