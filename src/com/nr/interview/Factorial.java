package com.nr.interview;

public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("The factorial of " + number + " is: " + factorialIterative(number));
    }

    public static long factorialIterative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}

