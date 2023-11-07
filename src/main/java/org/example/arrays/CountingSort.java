package org.example.arrays;

import java.util.Arrays;

import static java.lang.Math.*;

public class CountingSort {
    public static void run() {
        int[] arrayToSort = {4,2,8,3,1,7,9,1,10};
        int min = 1;
        int max = 10;

        countingSort(arrayToSort, min, max);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {4,2,8,3,1,7,9,1,10};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }

    public static void countingSort(int[] inputArray, int min, int max) {
        int[] countArray = new int[max-min+1];
        for(int i=0; i < inputArray.length; i++) {
            countArray[inputArray[i]-min]++;
        }

        int j = 0;
        for (int i=min; i <= max; i++) {
            while(countArray[i-min] > 0) {
                inputArray[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
