package com.nr.oops.polymorphsim;
class Student {

    void write(String slate, String chalk) {
        System.out.println("Student write on " + slate + " with " + chalk);

    }
}

class Teacher extends Student{
    @Override
    void write(String board, String marker){
        System.out.println("Teacher write on " + board + " with " + marker);
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
    Teacher t =new Teacher();
    t.write("board","marker");

    Student s= new Student();
    s.write("slate", "chalk");

    Student st = new Teacher();
    st.write("slate","chalk");
    }
}
