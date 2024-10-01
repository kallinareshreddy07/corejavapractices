package com.nr.interview;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 500; // First number
        int b = 100; // Second number

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using a temporary variable x
        int x = a;
        a = b;
        b = x;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
