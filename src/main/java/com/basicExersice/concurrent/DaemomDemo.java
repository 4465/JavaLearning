package com.basicExersice.concurrent;

public class DaemomDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        thread.setDaemon(true);
    }
}
