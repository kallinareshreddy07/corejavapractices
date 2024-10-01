package com.nr.constructors;

public class Employee {
    int id;
    String name;
    double salary;

    //default constructor
    public Employee(){

    }
    //parameterized constructor
    public Employee(int id, String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    //copy constructor
    public Employee(Employee emp){
         this.id= emp.id;
         this.name=emp.name;
         this.salary=emp.salary;
    }

    @Override  // to string method
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
