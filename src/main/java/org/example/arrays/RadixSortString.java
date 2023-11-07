package org.example.arrays;

public class RadixSortString {
    public static void run() {
        String[] arrayToSort = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        int radix = 26;
        int width = 5;
        radixSort(arrayToSort, radix, width);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }

        String[] unsortedArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        System.out.println();
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
    }

    public static void radixSort(String[] inputArray, int radix, int width) {
        int position = width-1;
        while (position >= 0) {
            radixSingleSort(inputArray, position, radix);
            position--;
        }
    }

    public static void radixSingleSort(String[] inputArray, int position, int radix) {
        int numItems = inputArray.length;
        int[] countArray = new int[radix];

        for(String value: inputArray) {
            countArray[getIndex(value, position)]++;
        }
        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j-1];
        }

        String[] tmpArray = new String[numItems];
        for(int tmpIndex = numItems -1 ; tmpIndex >= 0; tmpIndex--) {
            tmpArray[--countArray[getIndex(inputArray[tmpIndex], position)]] =
                    inputArray[tmpIndex];
        }
        System.arraycopy(tmpArray, 0, inputArray, 0, numItems);
    }

    public static int getIndex(String value, int position) {
        return value.charAt(position) - 'a';
    }
}
