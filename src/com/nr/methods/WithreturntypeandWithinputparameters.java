package com.nr.methods;
//Static method
public class WithreturntypeandWithinputparameters {
    /*
       Static method with two input parameters
     */
    public static int m1(int i, int j){
        return i+j;
    }

    public static void main(String[] args) {
        int i=WithreturntypeandWithinputparameters.m1(2,3); // calling using class name
        System.out.println(i);
    }
}
