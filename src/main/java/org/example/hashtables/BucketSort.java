package org.example.hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void run() {
        int[] arrayToSort = {41,55,87,13,88,91,12,18,-17};
        int radix = 2;

        bucketSort(arrayToSort, radix);

        System.out.println("Sorted array: ");
        for(int i=0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i] + " ");
        }

        int[] unsortedArray = {41,55,87,13,88,91,12,18,-17};
        System.out.println("Unsorted array is: ");
        for(int i=0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i] + " ");
        }
    }

    private static void bucketSort(int[] inputArray, int radix) {
        int numberOfBuckets = 10;
        List<Integer>[] buckets = new List[numberOfBuckets];
        for(int i=0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(int i=0; i < inputArray.length; i++) {
            int hashedValue = hash(inputArray[i], radix);
            buckets[hashedValue].add(inputArray[i]);
        }

        for(List bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i = 0; i < buckets.length; i++) {
            for(int value: buckets[i]){
                inputArray[j++] = value;
            }
        }
    }

    private static int hash(int number, int radix) {
        if(number < 10) {

        }
        int divisor = (int) Math.pow(10, radix);
        return (number / divisor) % 10;
    }
}
