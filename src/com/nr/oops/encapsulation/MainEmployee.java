package com.nr.oops.encapsulation;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(10);
        e.setName("Naresh");
        e.setAge(25);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getAge());

    }
}
