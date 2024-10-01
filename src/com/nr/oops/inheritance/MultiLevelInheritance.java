package com.nr.oops.inheritance;
class A{
    int id=100;
    public void m1(){
        System.out.println("This is m1 method");
    }
}

class B extends A{
    String name="Naresh";
    public void m2(){
        System.out.println("This is m2 method");
    }
}

class C extends B{
    double salary=50000d;
    public void m3(){
        System.out.println("This is m3 method");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(c.salary);

        c.m1();
        c.m2();
        c.m3();
    }
}
