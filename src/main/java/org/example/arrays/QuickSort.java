package org.example.arrays;

public class QuickSort {
    public static void run() {
        int[] arrayToSort = {-9,4,55,87,13,88,9,1,0,-1,1000,-54,118};

        quickSort(arrayToSort, 0, arrayToSort.length);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {-9,4,55,87,13,88,9,1,0,-1,1000,-54,118};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }
    // {4,55,87,13,88,9,1,0,-1};
    public static void quickSort(int[] inputArray, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(inputArray, start, end);
        quickSort(inputArray, start, pivotIndex);
        quickSort(inputArray, pivotIndex + 1, end);
    }

    public static int partition(int[] inputArray, int start, int end){
        int pivot = inputArray[start];
        int i = start;
        int j = end;

        while(i < j){
            while(i < j && inputArray[--j] >= pivot);
            if(i < j){
                inputArray[i] = inputArray[j];
            }
            while(i < j && inputArray[++i] <= pivot);
            if(i < j) {
                inputArray[j] = inputArray[i];
            }
        }
        inputArray[i] = pivot;
        return i;
    }
}
