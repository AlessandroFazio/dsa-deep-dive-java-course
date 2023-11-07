package org.example.arrays;

public class ShellInsertionSort {
    public static void run(){
        int[] arrayToSort = {9,8,1,33,9,14,5};

        for(int gap = arrayToSort.length / 2; gap > 0; gap /=2){

            for(int i=gap; i < arrayToSort.length; i++){
                int newElement = arrayToSort[i];
                int j=i;
                while(j >= gap && arrayToSort[j-gap] > newElement){
                    arrayToSort[j] = arrayToSort[j-gap];
                    j -= gap;
                }
                arrayToSort[j] = newElement;
            }
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
