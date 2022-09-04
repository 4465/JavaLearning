package com.basicExersice.concurrent.printjiaoti.Demo;

import java.time.chrono.ThaiBuddhistEra;

public class TwoThreadPrintNum3 {
    private static int count = 0;
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            while (count < 100){
                synchronized (lock){
                    if((count & 1) == 1){
                        System.out.println(Thread.currentThread().getName() + ":" + count++);
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "奇数线程");

        Thread t2 = new Thread(() ->{
            while (count < 100){
                synchronized (lock){
                    if((count & 1) == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + count++);
                    }else {
                        lock.notifyAll();
                    }
                }
            }
        }, "偶数线程");

        t1.start();
        t2.start();
    }
}
