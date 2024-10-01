package com.nr.interview;

public class EvenOddNumbers {

    public static void main(String[] args) {
        // Print even numbers from 1 to 30
        System.out.println("Even numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.print(i + " ");
            }
        }

        // Print a new line for clarity
        System.out.println();

        // Find and print an odd number
        System.out.println("Odd numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " ");
            }
        }
    }
}

