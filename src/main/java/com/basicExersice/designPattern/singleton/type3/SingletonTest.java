package com.basicExersice.designPattern.singleton.type3;



//懒汉式（线程安全, 同步方法）
class Singleton{

    //1.创建私有构造器
    private Singleton(){

    }

    //2.创建静态单例对象
    private static Singleton instance;

    // 3.提供一个静态开放接口，用于创建instance，加入了同步处理的代码
    public static synchronized Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
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
