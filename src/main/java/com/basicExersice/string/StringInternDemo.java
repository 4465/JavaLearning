package com.basicExersice.string;

public class StringInternDemo {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");


        System.out.println(s1 == s2);   //false

        String s3 = s1.intern();
        String s4 = "aaa";
        System.out.println(s1.intern() == s3);      //true
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("" + s1.hashCode() + s1 == s4 + s4.hashCode());
        System.out.println("" + s2.hashCode() + s2 == s4 + s4.hashCode());

    }
}
