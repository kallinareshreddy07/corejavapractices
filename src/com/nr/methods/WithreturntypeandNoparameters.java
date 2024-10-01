package com.nr.methods;
/*
Static method
 */
public class WithreturntypeandNoparameters {
    /*
    return type int
     */
    public static int m1(){
        return 1000;
    }
    /*
    return type String
     */
    public static String m2(){
        return "Naresh";
    }
 //Main method
    public static void main(String[] args) {
        int i = WithreturntypeandNoparameters.m1();  //calling using class name
        System.out.println(i);

        String j = WithreturntypeandNoparameters.m2();
        System.out.println(j);
    }
}
