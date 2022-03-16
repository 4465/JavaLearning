package com.basicExersice.concurrent;


//通过继承Thread类实现创建线程
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("start new thread");
    }
}

//通过实现Runnable接口创建线程
class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Runnable线程" + i);
        }
        System.out.println("通过Runnable接口实现创建线程");
    }
}


public class BuildThreadDemo {


    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我要学习多线程" + i);
        }

        Thread tt = new Thread(new MyThread1());
        tt.start();
    }

}
