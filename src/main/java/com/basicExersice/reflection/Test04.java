package com.basicExersice.reflection;

public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
    /**
     * 1.加载到内存，会产生一个类对应Class对象
     * 2.连接，链接阶数后，m=0
     * 3.初始胡
     *      <clinit>(){
     *          System.out.println("A类静态代码块初始化");
     *          m = 300;
     *          m = 100;
     *      }
     *
     * Class类是在初始化的过程中产生的
     */
}


class A{
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    static int m = 100;

    public A(){
        System.out.println("A类的无参构造初始化");
    }
}
