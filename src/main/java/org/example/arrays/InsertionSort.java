package org.example.arrays;

public class InsertionSort {
    public static void run(){
        int[] arrayToSort = {9,8,1,33,9,14,5};
        int firstUnsortedPartitionIndex = 1;
        while(firstUnsortedPartitionIndex < arrayToSort.length) {
            int newElement = arrayToSort[firstUnsortedPartitionIndex];
            for(int i=firstUnsortedPartitionIndex-1; i >= 0; i--) {
                if(newElement < arrayToSort[i]){
                    arrayToSort[i+1] = arrayToSort[i];
                    arrayToSort[i] = newElement;
                } else {
                    break;
                }
            }
            firstUnsortedPartitionIndex++;
        }
        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {9,8,1,33,9,14,5};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }
}
