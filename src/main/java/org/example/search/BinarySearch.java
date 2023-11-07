package org.example.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BinarySearch {
    public static void run() {
        int searchValue = 33;
        int arraySize = 44;
        int[] arrayToSearch = generateRandomArrayWithValue(arraySize, searchValue);
        Arrays.sort(arrayToSearch);

        int index = binarySearch(arrayToSearch, searchValue, 0, arrayToSearch.length);

        if(index == -1) {
            System.out.println("Sorry we didn't find the value you are looking for");
        } else {
            System.out.println("The value you are looking for is at index: " + index);
        }

        for(int i=0; i < arraySize; i++) {
            if(arrayToSearch[i] == searchValue) {
                System.out.println("Search value: " + searchValue + " is at index: " + i);
            }
        }
    }
    public static int[] generateRandomArrayWithValue(int arraySize, int searchValue) {
        int[] randomIntArray = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            // Generate a random integer and store it in the array
            randomIntArray[i] = random.nextInt(-100, 100);
        }

        int randomIndex = random.nextInt(arraySize-1);
        randomIntArray[randomIndex] = searchValue;

        for(int i=0; i < arraySize; i++) {
            if(randomIntArray[i] == searchValue && i != randomIndex) {
                randomIntArray[i] = searchValue + random.nextInt(1,10);
            }
        }
        return randomIntArray;
    }

    public static int binarySearch(int[] inputArray, int searchValue, int start, int end) {
        int index;

        if(end - start < 2) {
            int mid = (start + end) / 2;
            if(inputArray[mid] == searchValue) {
                index = mid;
            } else {
                index = -1;
            }
            return index;
        }

        int mid = (start + end ) / 2;
        if(inputArray[mid] == searchValue) {
            index = mid;
            return index;
        }

        if(inputArray[mid] > searchValue) {
            index = binarySearch(inputArray, searchValue, start, mid);
        } else {
            index = binarySearch(inputArray, searchValue, mid, end);
        }
        return index;
    }
}
