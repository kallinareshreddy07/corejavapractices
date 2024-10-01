package com.nr.oops.encapsulation;
//Encapsulation
public class Employee1 {
     private int id;
     private String name;
     private int age;

     //By using constructor
    public Employee1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
//Generating getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

