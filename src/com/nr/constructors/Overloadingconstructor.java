package com.nr.constructors;

public class Overloadingconstructor {
    public static void main(String[] args) {

        Employee1 ref1 = new Employee1();
        System.out.println(ref1);

        Employee1 ref2 =new Employee1(100);
        System.out.println(ref2);

        Employee1 ref3 = new Employee1( 500, "naresh");
        System.out.println(ref3);
    }
}
