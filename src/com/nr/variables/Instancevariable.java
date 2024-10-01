package com.nr.variables;
/*
Instance method
 */
public class Instancevariable {
    /*
   This is method
     */
    public void m1(){
        System.out.println("This is Instance variable");

    }
    public static void main(String[] args) {
        /*
        object created
         */
        Instancevariable ref = new Instancevariable();  //calling using object
        ref.m1();
    }
}
