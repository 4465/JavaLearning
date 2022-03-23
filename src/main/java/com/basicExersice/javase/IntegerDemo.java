package com.basicExersice.javase;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 127, f4=127, f5=128, f6=128;
        Integer f7 = -127, f8 = -127, f9 = -128, f10 = -128;
        System.out.println(f1 == f2);   //true
        System.out.println(f4 == f3);   //true
        System.out.println(f5 == f6);   //false
        System.out.println("========================================");
        System.out.println(f7 == f8);   //true
        System.out.println(f9 == f10);  //true

        System.out.println(f5.equals(f6));  //true

        System.out.println("========================================");

        int a1 = 127;
        System.out.println(f3==a1);    //true

        System.out.println("========================================");
        System.out.println(f3.hashCode());
        System.out.println(f4.hashCode());
        System.out.println(f5.hashCode());
        System.out.println(f6.hashCode());

    }
}
