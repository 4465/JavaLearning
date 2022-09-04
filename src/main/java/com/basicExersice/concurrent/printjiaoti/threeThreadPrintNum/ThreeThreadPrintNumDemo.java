package com.basicExersice.concurrent.printjiaoti.threeThreadPrintNum;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreeThreadPrintNumDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTread(0), "1线程");
        Thread t2 = new Thread(new MyTread(1), "2线程");
        Thread t3 = new Thread(new MyTread(2), "3线程");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyTread implements Runnable{
    private static Object lock = new Object();

    private static int count = 0;

    int no;

    public MyTread(int no){
        this.no = no;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if(count > 100){
                    break;
                }
                if(count % 3 == this.no){
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }
    }
}