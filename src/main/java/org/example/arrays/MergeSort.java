package org.example.arrays;

public class MergeSort {
    public static void run(){
        int[] arrayToSort = {4,55,87,88,9,1,0,-1};

        mergeSort(arrayToSort, 0, arrayToSort.length);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {4,55,87,88,9,1,0,-1};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }

    public static void mergeSort(int[] inputArray, int start, int end) {
        if(end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        if(inputArray[mid -1] <= inputArray[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tmpIndex = 0;

        int[] tmpArray = new int[end - start];
        while(i < mid && j < end) {
            tmpArray[tmpIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        System.arraycopy(inputArray, i, inputArray, tmpIndex + start, mid-i);
        System.arraycopy(tmpArray, 0, inputArray, start, tmpIndex);
    }
}
