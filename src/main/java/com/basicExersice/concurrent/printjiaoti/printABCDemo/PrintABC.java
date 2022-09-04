package com.basicExersice.concurrent.printjiaoti.printABCDemo;


public class PrintABC{
    static volatile Integer count = 0;


    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; ) {

                synchronized (count) {
                    if (count % 3 == 0) {
                        System.out.println("A");
                        count++;
                        i++;
                    }
                }
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; ) {

                synchronized (count) {
                    if (count % 3 == 1) {
                        System.out.println("B");
                        count++;
                        i++;
                    }
                }
            }
        },"B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; ) {

                synchronized (count) {
                    if (count % 3 == 2) {
                        System.out.println("C");
                        count++;
                        i++;
                    }
                }
            }
        },"C").start();
    }

}


