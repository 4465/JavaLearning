package com.basicExersice;

import java.util.Random;

public class RandomDemo {
    public void getRandomBySetSeed(int seed){
        Random r = new Random(seed);
        for(int i=0;i<10;i++){
            System.out.println(r.nextInt(10));
        }
    }

    public void commonOp(){
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10));
        System.out.println(r.nextLong());
        System.out.println(r.nextFloat());
        System.out.println(r.nextDouble());
    }

    public static void main(String[] args) {
        RandomDemo RD = new RandomDemo();
        RD.commonOp();
        RD.getRandomBySetSeed(1234);
    }
}
