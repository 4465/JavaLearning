package com.basicExersice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SychronizedExample{
    /**
     * 同一对象调用时
     *0 1 2 3 4 5 6 0 7 1 8 2 9 3 4 5 6 7 8 9
     * 不同对象调用时
     * 0 0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
     */
    public void func1(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

    }


    /**
     * 同一对象调用时
     *0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
     * 不同对象调用时
     * 0 0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
     */
    public void func2(){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }

        }

    }
}

public class SynchronizedDemo01 {


    public static void main(String[] args) {
        SychronizedExample e1 = new SychronizedExample();
        SychronizedExample e2 = new SychronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(()->e1.func1());
//        executorService.execute(()-> e1.func1());
//        System.out.println();
//        executorService.execute(()->e1.func2());
//        executorService.execute(()->e1.func2());
//        executorService.execute(()->e1.func1());
//        executorService.execute(()->e2.func1());
        executorService.execute(()->e1.func2());
        executorService.execute(()->e2.func2());
    }

}
