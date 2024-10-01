package com.nr.constructors;

public class Employee1 {
    int id;
    String name;

/*
     If we declare more than one constructor with same name
     and with different parameters list is called overloading constructor
 */
    public Employee1(){

    }
    public Employee1(int id){
        this.id=id;
    }
     public Employee1(int id, String name){
         this.id=id;
         this.name=name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
