package org.example.arrays;

public class SelectionSortRecursive {
    public static void run() {
        int[] arrayToSort = {4,55,87,13,88,9,1,0,-1};
        int unsortedPartitionIndex = 0;
        selectionSort(arrayToSort, unsortedPartitionIndex);

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

    public static void selectionSort(int[] inputArray, int partitionIndex){
        if(partitionIndex >= inputArray.length) {
            return;
        }
        selectionSort(inputArray, ++partitionIndex);
        sortPartition(inputArray, partitionIndex);
    }

    public static void sortPartition(int[] inputArray, int partitionIndex) {
        int largestValueIndex = 0;
        for(int i=0; i < partitionIndex; i++) {
            if(inputArray[i] > inputArray[largestValueIndex]) {
                largestValueIndex = i;
            }
        }
        int largestValue = inputArray[largestValueIndex];
        inputArray[largestValueIndex] = inputArray[partitionIndex-1];
        inputArray[partitionIndex-1] = largestValue;
    }
}
