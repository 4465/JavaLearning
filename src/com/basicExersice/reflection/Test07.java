package com.basicExersice.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.basicExersice.reflection.User");

        //获得类的名字
        System.out.println(c1.getName());   //包名+ 类名
        System.out.println(c1.getSimpleName());  //类名

        //获得类的属性
        System.out.println("====================================");
        Field[] fields = c1.getFields();    //只能找到public属性
        for(Field field:fields){
            System.out.println(field);
        }

        fields = c1.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);   //找到全部属性
        }

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("====================================");
        Method[] methods = c1.getMethods();
        for (Method method:methods) {
            System.out.println("正常的Method:" + method);   //获得奔雷及其父类的全部public方法
        }
        methods = c1.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println("Declared的Method:" + method);  //获得奔雷的所有方法,可以获得私有方法
        }

        //获得指定方法

        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);   //重载
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        System.out.println("====================================");
        Constructor[] constructors = c1.getConstructors(); //获得所有public方法
        for (Constructor constructor:constructors
             ) {
            System.out.println(constructor);
        }
        constructors = c1.getDeclaredConstructors();  //获得所有构造方法
        for (Constructor constructor:constructors
        ) {
            System.out.println(constructor);
        }

        //获得指定的构造器
        Constructor constructor = c1.getDeclaredConstructor();
        System.out.println(constructor);
    }
}
