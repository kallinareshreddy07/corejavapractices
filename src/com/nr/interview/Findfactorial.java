package com.nr.interview;

public class Findfactorial {
    public static void main(String[] args) {

        int number=5;       // 5!=5*4*3*2*1  normal process for finding factorial
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}