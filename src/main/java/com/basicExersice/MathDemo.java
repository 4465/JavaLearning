package com.basicExersice;

public class MathDemo {
    public void commonOp(){
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-7.8));

        System.out.println(Math.max(100,98));
        System.out.println(Math.max(100,92.8));
        System.out.println(Math.max(1.3,2.8));

        System.out.println(Math.pow(2,10));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.exp(2));
        System.out.println(Math.log(4));
        System.out.println(Math.log10(100));

        System.out.println(Math.sin(3.14));
        System.out.println(Math.cos(3.14));
        System.out.println(Math.tan(3.14));
        System.out.println(Math.asin(1.0));
        System.out.println(Math.acos(1.0));

        double pi = Math.PI;
        double e = Math.E;
        System.out.println(Math.sin(pi / 6));

        System.out.println(Math.random());
    }

    public long getRandom(){
        double x = Math.random();
        double min = 10;
        double max = 50;
        double y = x * (max -min) + min;
        long n = (long) y;
        System.out.println("y:" + y);
        System.out.println("n:" + n);
        return n;
    }

    public static void main(String[] args) {
        MathDemo MD = new MathDemo();
        MD.commonOp();
        System.out.println(MD.getRandom());
    }
}
