package com.basicExersice;

public class interfaceClass {

}

interface Person1{
    void run();
    String getName();
}

interface Hello{
    void hello();
}

class Student1 implements Person1, Hello{
    private String name;

    public Student1(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(this.name + " run");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void hello(){
        System.out.println("hello");
    }
}