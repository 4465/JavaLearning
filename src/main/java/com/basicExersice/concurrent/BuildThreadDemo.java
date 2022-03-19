package com.basicExersice.concurrent;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

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


//通过Callable接口创建线程
class MyThread2 implements Callable{
    @Override
    public Object call() throws Exception {
        return 123;
    }
}

public class BuildThreadDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我要学习多线程" + i);
        }

        MyThread1 instance = new MyThread1();

        Thread tt = new Thread(instance);
        tt.start();

        MyThread2 myThread2 = new MyThread2();
        FutureTask<Integer> ft = new FutureTask<>(myThread2);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());

    }

}
