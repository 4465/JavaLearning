package com.basicExersice.designPattern.singleton.type6;



// 懒汉式（线程安全，静态内部类）
// 两次检查instance是否为null

class Singleton{
    //构造器私有化
    private Singleton(){

    }

    //写一个静态内部类，该类中有一个静态属性instance
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //共享变量一旦修改就刷入到主存里面
    private volatile static Singleton instance;

    //提供一个静态公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
