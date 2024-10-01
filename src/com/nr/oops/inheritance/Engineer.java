package com.nr.oops.inheritance;
//sub class
public class Engineer extends Employee{
//parameterized constructor
   public Engineer(int id, String name, double salary){
       this.id=id;
       this.name=name;
       this.salary=salary;
   }
//method
  public void getengineerdetails(){
      getemployeedetails();
  }
}
