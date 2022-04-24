package com.basicExersice.designPattern.factory.FactoryMethod.Demo;

class Factory{
    public Product createProduct(){
        return null;
    }
}

class Product{
    public void show(){

    }
}

class ProductA extends Product{
    public void show(){
        System.out.println("生产产品A");
    }
}



class ProductB extends Product{
    public void show(){
        System.out.println("生产产品B");
    }
}


class FactoryA extends Factory{
    public Product creteProduct(){
        return new ProductA();
    }
}

class FactoryB extends Factory{
    public Product creteProduct(){
        return new ProductB();
    }
}


public class FactoryMethodDemo {
    /**
     * A类工厂生产A类产品，B类工厂生产B类产品
     * @param args
     */
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.creteProduct().show();

        FactoryB factoryB = new FactoryB();
        factoryB.creteProduct().show();
    }
}
