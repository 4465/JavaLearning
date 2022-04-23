package com.basicExersice.designPattern.singleton.type5;


// 懒汉式（线程安全，双重检查）
// 两次检查instance是否为null

class Singleton{
    private Singleton(){

    }

    //共享变量一旦修改就刷入到主存里面
    private volatile static Singleton instance;

    //提供一个静态公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
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
