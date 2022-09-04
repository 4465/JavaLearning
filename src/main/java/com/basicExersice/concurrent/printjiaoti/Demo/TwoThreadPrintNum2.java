package com.basicExersice.concurrent.printjiaoti.Demo;

/**
 * 两个线程交替打印
 * volatile
 */
public class TwoThreadPrintNum2 {
    private static int i = 0;

    private static volatile boolean flag = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            while (true){
                if(flag && i < 10 ){
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                    flag = !flag;
                }
            }
        });

        Thread thread2 = new Thread(() ->{
            while (true){
                if(!flag && i < 10){
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                    flag = !flag;
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
