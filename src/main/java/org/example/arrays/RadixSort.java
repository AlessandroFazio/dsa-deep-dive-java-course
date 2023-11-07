package org.example.arrays;

public class RadixSort {
    public static void run() {
        int[] arrayToSort = {55,44,13,90,82,61,10,78};
        int radix = 10;
        int width = 2;
        radixSort(arrayToSort, radix, width);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {55,44,13,90,82,61,10,78};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }

    public static void radixSort(int[] inputArray, int radix, int width) {
        int position = 0;
        int[] tmpArray = new int[inputArray.length];

        while (position < width) {
            radixSingleSort(inputArray, position, radix);
            position++;
        }
    }

    public static void radixSingleSort(int[] inputArray, int position, int radix) {
        int numItems = inputArray.length;
        int[] countArray = new int[radix];

        for(int value: inputArray) {
            countArray[getDigit(value, position, radix)]++;
        }
        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j-1];
        }

        int[] tmpArray = new int[numItems];
        for(int tmpIndex = numItems -1 ; tmpIndex >= 0; tmpIndex--) {
            tmpArray[--countArray[getDigit(inputArray[tmpIndex], position, radix)]] =
                    inputArray[tmpIndex];
        }

        for(int tmpIndex = 0; tmpIndex < numItems; tmpIndex++) {
            inputArray[tmpIndex] = tmpArray[tmpIndex];
        }
    }

    public static int getDigit(int num, int position, int radix) {
        if (position < 0) {
            throw new IllegalArgumentException("Position must be non-negative.");
        }
        // Extract the digit at the specified position
        int divisor = (int) Math.pow(10, position);
        return (num / divisor) % radix;
    }
}
