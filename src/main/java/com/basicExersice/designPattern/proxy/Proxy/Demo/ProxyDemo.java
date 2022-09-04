package com.basicExersice.designPattern.proxy.Proxy.Demo;

interface Subjct{
    public void doSomething();
}

class RealSubject implements Subjct{
    @Override
    public void doSomething() {
        System.out.println("我想找一份Java实习的工作");
    }
}

class Proxy implements Subjct{
    @Override
    public void doSomething() {
        RealSubject realSubject = new RealSubject();
        realSubject.doSomething();
        this.print();
    }

    public void print(){
        System.out.println("正在面试");
    }
}


public class ProxyDemo {
    public static void main(String[] args) {
        Subjct proxy = new Proxy();
        proxy.doSomething();
    }
}
