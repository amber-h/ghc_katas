package samearrays;

import java.util.Arrays;

public class SameArrays {

    public static void main(String[] arr) {
        //TODO parsing input and stuff
        Integer[] one = new Integer[]{2, 5};
        Integer[] two = new Integer[]{3, 5};
        Integer[] three = new Integer[]{6, 2};
        DoubleArray firstList = new DoubleArray(new Integer[][]{one, two, three});


        one = new Integer[]{2, 6};
        two = new Integer[]{5, 3};
        three = new Integer[]{2, 5};


        DoubleArray secondList = new DoubleArray(new Integer[][]{one, two, three});


        final SameArrays sameArrays = new SameArrays();
        String output = sameArrays.isSame(firstList, secondList) ? "is same !" : "is not same !";
        System.out.print("**********************" + output);

    }

    public boolean isSame(DoubleArray first, DoubleArray second) {
        if (first.getLength() != second.getLength()) {
            return false;
        }

        final Integer[] firstSingle = addAll(first);
        final Integer[] secondSingle = addAll(second);

        Arrays.sort(firstSingle);
        Arrays.sort(secondSingle);
        return Arrays.equals(firstSingle, secondSingle);
    }

    public Integer[] addAll(DoubleArray doubleArray) {
        final int doubleArrayLength = doubleArray.getLength();
        Integer[] added = new Integer[doubleArrayLength];

        for (int i = 0; i < doubleArrayLength; i++) {
            final Integer[] singleArray = doubleArray.fetch(i);
            added[i] = singleArray[0] + singleArray[1];
        }
        return added;
    }

}