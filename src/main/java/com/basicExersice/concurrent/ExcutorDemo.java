package com.basicExersice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1; i++) {
            executorService.execute(new MyThread1());
        }
        executorService.shutdown();
    }
}
