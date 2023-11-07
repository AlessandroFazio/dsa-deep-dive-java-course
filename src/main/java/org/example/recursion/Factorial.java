package org.example.recursion;

public class Factorial {
    public static int calculate_iteratively(int num){
        if(num < 0){
            throw new IllegalArgumentException("factorial of negative numbers is not define, got %s".formatted(num));
        }
        if(num > 15){
            throw new IllegalArgumentException("the result will be too big for an int type, sorry. You can set 15 as a maximum, but got %s".formatted(num));
        }
        int factorial = 1;
        if(num == 0){
            return factorial;
        }
        int multiplier = 1;
        while(multiplier <= num){
            factorial *= multiplier;
            multiplier++;
        }
        return factorial;
    }

    public static int calculate_recursively(int num) {
        if(num < 0){
            throw new IllegalArgumentException("factorial of negative numbers is not define, got %s".formatted(num));
        }
        if(num == 0){
            return 1;
        }
        if(num > 15){
            throw new IllegalArgumentException("the result will be too big for an int type, sorry. You can set 15 as a maximum, but got %s".formatted(num));
        }
        return num * calculate_iteratively(num - 1);
    }
}
