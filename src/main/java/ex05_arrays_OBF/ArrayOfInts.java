package ex05_arrays_OBF;

public class ArrayOfInts {

    public int sumOfArray(int[] array) {
        if (array == null) return 0;
        int sum = 0;
        for (int element : array)
                sum += element;
        return sum;
    }

    public int sumOfEven(int[] array) {
        if (array  == null) return 0;
        int sumOfEven = 0;
        for (int element : array) if (element % 2 == 0) sumOfEven += element;
        return sumOfEven;
    }
}
