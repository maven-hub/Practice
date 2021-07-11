package basics.arrayexceptions;

import basics.arrayexceptions.exceptions.*;

import java.util.Arrays;

public class IntegerArray {
    private int index;
    private final int size;
    private final int[] array;

    public IntegerArray(int size) throws IllegalSizeException {
        if (size <= 0) {
            throw new IllegalSizeException("Size must be greater than 0");
        }
        this.size = size;
        this.array = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void print() throws EmptyArrayException {
        int sum = 0;
        for (int el : array) {
            sum += el;
        }

        if (sum == 0) {
            throw new EmptyArrayException("The array is empty");
        }

        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add(int value) throws ArrayOverflowException {
        if (index == size) {
            throw new ArrayOverflowException("Array is full");
        }
        array[index] = value;
        index++;
    }

    public int get(int num) throws WrongIndexException {
        if (num < 0 || num >= index) {
            throw new WrongIndexException("No such index");
        }
        return array[num];
    }

    public void deleteLast() throws IllegalIndexException {
        if (index == 0) {
            throw new IllegalIndexException("Can't delete. Array is empty.");
        }
        index--;
    }

    public void deleteAll() {
        Arrays.fill(array, 0);
        index = 0;
    }
}
