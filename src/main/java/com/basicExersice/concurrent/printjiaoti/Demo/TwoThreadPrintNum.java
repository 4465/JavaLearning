package com.basicExersice.concurrent.printjiaoti.Demo;


import com.basicExersice.concurrent.YieldDemo;

/**
 * 交替打印奇数和偶数
 */
public class TwoThreadPrintNum {
    private static Object lock = new Object();
    private static int i;

    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                while (i < 50){
                    synchronized (lock){
                        if((i & 1) == 0){
                            System.out.println(Thread.currentThread() + ":" + i);
                            i++;
                        }
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                while (i < 50){
                    synchronized (lock){
                        if((i & 1) == 1){
                            System.out.println(Thread.currentThread() + ":" + i);
                            i++;
                        }
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}

