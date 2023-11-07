package org.example.queues.commons;

import java.util.List;
import java.util.Stack;

public class StackQueueCheckPalindrome {
    private static List<String> stack;
    private static List<String> queue;

    private static boolean checkIfPalindrome(String value){
        String cleanedValue = cleanString(value);
        StringBuilder builder = new StringBuilder(value.length());
        return false;
    }

    private static String cleanString(String inputString) {
        return inputString.replaceAll("[\\s\\p{P}]+", "").toLowerCase();
    }
}
