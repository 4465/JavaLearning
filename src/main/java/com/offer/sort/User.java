package com.offer.sort;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class User implements Serializable, Comparable<User> {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    public User (){}
    public User (int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
    @Override
    public String toString() {
        return "[user={age=" + age + ",name=" + name + "}]";
    }

    class MyComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().charAt(0)-o2.getName().charAt(0);
        }
    }

    public static void main(String[] args) {
        User u1 = new User(12, "xiaohua");
        User u2 = new User(10, "abc");
        User u3 = new User(15,"ccc");
        User[] users = {u1,u2,u3};
        System.out.print("数组排序前：");
        printArray(users);
        System.out.println();
        Arrays.sort(users);
        System.out.print("数组排序1后：");
        printArray(users);
        System.out.println();
        Arrays.sort(users);
        System.out.print("数组排序2后：");
        printArray(users);
        System.out.println();
        Arrays.sort(users, Comparator.reverseOrder());// 针对内置的排序进行倒置
        System.out.print("数组排序3后：");
        printArray(users);
    }
    public static void printArray (User[] users) {
        for (User user:users) {
            System.out.print(user.toString());
        }
    }

}


