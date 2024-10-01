package com.nr.methods;
//Static method
public class Withnoreturntypeandwithinputparameters {
//Static  method m1 with one input parameter
    public static void m1(int i){
        System.out.println(i);
    }

    public static void m2(int k,String j){
         String str= k + j;
        System.out.println(str);
    }
    public static void main(String[] args) {
        Withnoreturntypeandwithinputparameters.m1(100);
        Withnoreturntypeandwithinputparameters.m2(123, "Naresh");  //calling using class name
    }
}
