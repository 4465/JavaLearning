package com.basicExersice.concurrent.printjiaoti.threeThreadDemo;


import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程交替打印ABC
 */

class MyThread implements Runnable{
    private String name;
    private Object pre = new Object();
    private Object self = new Object();


    public MyThread(String name, Object pre, Object self){
        this.name = name;
        this.pre = pre;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 5;
        while (count > 0){
            synchronized (pre){
                synchronized (self){
                    System.out.println(name);
                    count--;
                    self.notifyAll();
                }
                try {
                    pre.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ThreeThreadPrintCharDemo {
    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThread A = new MyThread("A", c, a);
        MyThread B = new MyThread("B", a, b);
        MyThread C = new MyThread("C", b, a);

        Thread threadA = new Thread(A);
        Thread threadB = new Thread(A);
        Thread threadC = new Thread(A);

        threadA.start();
        threadB.start();
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();

    }
}
