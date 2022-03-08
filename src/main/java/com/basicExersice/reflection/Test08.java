package com.basicExersice.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象,通过反射
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class c1 = Class.forName("com.basicExersice.reflection.User");

        //构造一个对象
        User user = (User) c1.newInstance();  //强制转换//本质上是调用了无参构造器，如果没有无参构造器，会报错
        System.out.println(user);


        //通过构造器创建对象
        Constructor contructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)contructor.newInstance("刘威甫", 001, 18);
        System.out.println(user2);


        //通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3, "张三");
        //invoke：激活的意思
        //（对象，”方法的值“）
        System.out.println(user3.getName());

        //通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);   //检查权限，默认是开启的，name为private私有属性，需要关闭程序的安全检测
        name.set(user4, "李四");
        System.out.println(user4);
    }
}
