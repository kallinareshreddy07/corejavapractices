package com.nr.interview;


public class Sumofdigits {

    public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumOfDigits(int number) {
        number = Math.abs(number); // Handle negative numbers
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add it to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}



