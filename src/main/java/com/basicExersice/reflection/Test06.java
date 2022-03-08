package com.basicExersice.reflection;

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的弗雷雷接载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器(c/c++)
        ClassLoader root = parent.getParent();
        System.out.println(root);

        //测试当前类是哪个类加载器加载的
        ClassLoader classLoader = Class.forName("com.basicExersice.reflection.Test06").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));




//        E:\Java_Project\javaLearning\out\production\javaLearning;
//        D:\java_jar\mysql-connector-java-8.0.28\mysql-connector-java-8.0.28.jar

    }
}
