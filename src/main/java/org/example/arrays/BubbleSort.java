package org.example.arrays;

public class BubbleSort {
    public static void run() {
        int[] arrayToSort = {7,8,2,4};
        int unsortedPartitionIndex = arrayToSort.length;
        while(unsortedPartitionIndex > 0) {
            for (int i = 0; i < unsortedPartitionIndex-1; i++) {
                if (arrayToSort[i] > arrayToSort[i+1]) {
                    int lowerValue = arrayToSort[i+1];
                    arrayToSort[i+1] = arrayToSort[i];
                    arrayToSort[i] = lowerValue;
                }
            }
            unsortedPartitionIndex--;
        }
        for(int i=0; i < arrayToSort.length; i++){
            System.out.println(arrayToSort[i] + " ");
        }
        System.out.println("Your result should be like this: ");
        int[] sortedArray = {2,4,7,8};
        for(int i=0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i] + " ");
        }
    }
}
