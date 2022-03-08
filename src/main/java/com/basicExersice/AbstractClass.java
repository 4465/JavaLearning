package com.basicExersice;

public class AbstractClass {
    public static void main(String[] args){
        Person s = new Student();
        Person t = new Teacher();
        s.run();
        t.run();
    }
}

abstract class Person{
    public abstract void run();
}

class Student extends Person{
    public void run(){
        System.out.println("Student.run");
    }
}

class Teacher extends Person{
    public void run(){
        System.out.println("Teacher.run");
    }
}