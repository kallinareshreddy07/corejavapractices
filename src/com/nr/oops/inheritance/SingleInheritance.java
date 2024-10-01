package com.nr.oops.inheritance;
// main class
public class SingleInheritance {
    //main method
    public static void main(String[] args) {
        //creating object for Engineer class
        Engineer engineer = new Engineer(1, "naresh", 50000);
        engineer.getengineerdetails();

System.out.println("**************** Manager class ************************");
//creating object for Manager class
        Manager manager = new Manager(2, "abbas", 55000);
        manager.getmanagerdetails();
    }
}
