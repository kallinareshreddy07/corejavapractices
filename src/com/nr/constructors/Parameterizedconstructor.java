package com.nr.constructors;

public class Parameterizedconstructor {
    public static void main(String[] args) {

        //object created
        Employee ref = new Employee(100,"naresh", 50000d);
        System.out.println(ref.id);
        System.out.println(ref.name);
        System.out.println(ref.salary);
        //System.out.println(ref);

      /*
      this line is just for separately showing copy constructor
       */
       System.out.println("This is copy constructor");
       //object created for copy constructor
        Employee ref1 = new Employee(ref);
            System.out.println(ref1);

    }
}
