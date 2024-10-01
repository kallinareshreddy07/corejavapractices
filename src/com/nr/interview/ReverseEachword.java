package com.nr.interview;

public class ReverseEachword {
    public static void main(String[] args) {
        String str = " Java is High level language";

        String[] s = str.split(" ");

        for (String ss : s) {
            String reverse = "";
            for (int i = ss.length() - 1; i >= 0; i--) {
                reverse = reverse + ss.charAt(i);

            }
            System.out.print(reverse + " ");
        }
    }
}



