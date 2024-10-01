package com.nr.methods;
// Instance method
public class Withnoreturntypeandinputparameters {
    public void m1(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        // calling using object
        Withnoreturntypeandinputparameters ref = new Withnoreturntypeandinputparameters();
        ref.m1(100);
    }
}
