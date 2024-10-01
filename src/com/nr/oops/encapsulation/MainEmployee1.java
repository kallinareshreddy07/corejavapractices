package com.nr.oops.encapsulation;

public class MainEmployee1 {
    public static void main(String[] args) {
        Employee1 e = new Employee1(19, "Naresh", 24);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }
}
