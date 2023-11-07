package org.example.arrays;

public class SelectionSort {
    public static void run(){
        int[] arrayToSort = {4,55,87,13,88,9,1,0,-1};
        int unsortedPartitionIndex = arrayToSort.length;
        while(unsortedPartitionIndex > 0){
            int largestValueIndex = 0;
            for(int i=0; i < unsortedPartitionIndex; i++) {
                if(arrayToSort[i] > arrayToSort[largestValueIndex]) {
                    largestValueIndex = i;
                }
            }
            int largestValue = arrayToSort[largestValueIndex];
            arrayToSort[largestValueIndex] = arrayToSort[--unsortedPartitionIndex]; // lower the unsortedPartitionIndex by one,
                                                                                    // this var is referenced in the while loop condition
            arrayToSort[unsortedPartitionIndex] = largestValue;
        }

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {4,55,87,13,88,9,1,0,-1};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }
}
