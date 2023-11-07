package org.example.hashtables;

public class SimpleIntegerHash {
    public static void run(int testValue) {
        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};

        for(int i=0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }

        for(int i=0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("This should be " + testValue + ": " + (nums[hash(testValue)] == testValue));
    }

    private static int hash(int value) {
        return Math.abs(value) % 10;
    }
}
