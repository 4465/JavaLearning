package com.basicExersice.designPattern.singleton.type7;


//使用枚举实现单例模式， 推荐使用
enum Singleton{
    INSTANCE;  //属性

    public void sayOK(){
        System.out.println("ok~");
    }

}


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
