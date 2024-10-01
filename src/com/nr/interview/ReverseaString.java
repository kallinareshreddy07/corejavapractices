package com.nr.interview;

public class ReverseaString {
    public static void main(String[] args) {
        String s = "hello";
        String reversed = reverseString(s);
        System.out.println(reversed);  // Output: "olleh"
    }

    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
}

