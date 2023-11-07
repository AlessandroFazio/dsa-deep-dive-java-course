package org.example.stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CheckPalindromeStack {
    public static void run() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("racecar");
        stringList.add("NotPalindrome");
        stringList.add("level");
        stringList.add("madam");
        stringList.add("NotPalindrome");
        stringList.add("civic");
        stringList.add("NotPalindrome");
        stringList.add("kayak");
        stringList.add("NotPalindrome");

        for(String inputString: stringList) {
            System.out.println("input string is " +  "'" + inputString + "'" + " is palindrome: " + isPalindrome(inputString));
        }
    }
    private static boolean isPalindrome(String inputString) {
        inputString = cleanString(inputString);
        StringBuilder builder = new StringBuilder(inputString);
        for(int i = 1; i <= inputString.length(); i++) {
            builder.setCharAt(
                    inputString.length()-i,
                    inputString.charAt(i-1)
            );
        }
        String reversedString = builder.toString();
        return reversedString.equals(inputString);
    }

    private static String cleanString(String inputString) {
        return inputString.replaceAll("[\\s\\p{P}]+", "").toLowerCase();
    }
}

