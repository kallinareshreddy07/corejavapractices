package com.nr.methods;


// Instance method
public class WithReturntypeWithparameters {
    //Instance method with two input parameters
    public int m1(int i, int j){
       return i+j;

    }
    public static void main(String[] args) {
        WithReturntypeWithparameters ref = new WithReturntypeWithparameters(); //calling using object
        int sum = ref.m1(20,30);
        System.out.println(sum);
    }
}
