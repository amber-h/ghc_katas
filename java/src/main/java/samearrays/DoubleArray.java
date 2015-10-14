package samearrays;

public class DoubleArray {

    private Integer[][] doubleArray;

    public DoubleArray(Integer[][] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public Integer[][] getDoubleArray() {
        return doubleArray;
    }

    public void setDoubleArray(Integer[][] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public int getLength() {
        return this.doubleArray.length;
    }

    public Integer[] fetch(int i) {
        return this.doubleArray[i];
    }
}
