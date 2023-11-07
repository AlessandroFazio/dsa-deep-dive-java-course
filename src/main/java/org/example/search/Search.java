package org.example.search;

public class Search {
    public static void run() {
        int[] arrayToSearch = {1,2,3,-1,4,-99};
        int index = search(arrayToSearch, -99);
        if(index == -1) {
            System.out.println("Sorry we didn't find the value you are looking for");
        } else {
            System.out.println("The value you are looking for is at index: " + index);
        }
    }

    public static int search(int[] inputArray, int valueToFind) {
        int index = -1;
        for(int i=0; i < inputArray.length; i++) {
            if(inputArray[i] == valueToFind){
                index = i;
            }
        }
        return index;
    }
}
