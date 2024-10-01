package com.nr.interview;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345; // Example number
        System.out.println("The reversed number is: " + reverseNumber(number));
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        int original = number; // Preserve the original number

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to reversed
            number /= 10; // Remove the last digit
        }

        return reversed;
    }
}

