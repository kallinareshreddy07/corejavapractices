package com.nr.methods;
//Instance method
public class WithreturntypeAndNoInputParameters {
    public int m1(){
        return 10;

    }
    public static void main(String[] args) {
//object creation calling using object
        WithreturntypeAndNoInputParameters ref = new WithreturntypeAndNoInputParameters();
        int i = ref.m1();
        System.out.println(i);
    }
}
