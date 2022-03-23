package com.basicExersice.javase;

public class StringDemo {
    public static void testStringEquals(){
        String str_a = "aaa";
        String str_b = new String("aaa");
//        str_b = "ccc";
        String str_c = "aaa";
        String str_d = "aa" + new String("a");
        String str_e = "aa" + "a";
        System.out.println(str_a.hashCode());
        System.out.println(str_b.hashCode());
        System.out.println(str_c.hashCode());
        System.out.println(str_d.hashCode());
        System.out.println(str_e.hashCode());

        System.out.println("===================================");
        System.out.println((Object)str_a.equals(str_b));    //true
        System.out.println(str_a.equals(str_b));   // true
        System.out.println(str_a.equals(str_d));
    }


    public static void main(String[] args) {
        StringDemo.testStringEquals();
    }
}
