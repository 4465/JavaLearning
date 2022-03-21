package com.basicExersice.string;

public class NewStringDemo {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = new String("123");
        System.out.println(str1 == str2);     //false

        String str3 = "123".intern();
        System.out.println(str1 == str3);     //true
        System.out.println(str2 == str3);     //false



        String str4 = str2.intern();
        System.out.println(str1 == str4);     //true
        System.out.println(str2 == str4);     //false
        System.out.println(str3 == str4);     //true


        String s1 = new String("123");
        String s2 = "123";
        System.out.println(s1 == s2);       //false

        String s3 = new String("123") + new String("123");
        s3.intern();
        String s4 = "123123";
        System.out.println(s3 == s4);           //true


    }
}
