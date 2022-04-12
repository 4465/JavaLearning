package com.basicExersice.generics;

public class MethodDemo {

    private  static <T extends Number> double add(T a, T b){
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        add(15, 96);
    }
}
