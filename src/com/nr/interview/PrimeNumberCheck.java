package com.nr.interview;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int number = 9; // Example number to check

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Even number greater than 2 is not prime
        }

        // Check for factors from 3 to sqrt(number)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Number is divisible by i
            }
        }

        return true; // Number is prime
    }
}

