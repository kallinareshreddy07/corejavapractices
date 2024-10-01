package com.nr.oops.inheritance;
//sub class
public class Manager extends Employee {
    //parameterized constructor
    public Manager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //method
        public void getmanagerdetails () {
        getemployeedetails();
        }

}
