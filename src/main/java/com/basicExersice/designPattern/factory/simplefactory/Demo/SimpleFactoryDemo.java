package com.basicExersice.designPattern.factory.simplefactory.Demo;

import java.util.Scanner;

class Product{
    public void getProduct(){

    }
}

class Product1 extends Product{
    String name;

    public Product1(String name){
        this.name = name;
    }

    public void getProduct(){
        System.out.println("生产产品1" + name);
    }
}

class Product2 extends Product{
    String name;

    public Product2(String name){
        this.name = name;
    }

    public void getProduct(){
        System.out.println("生产产品2:" + name );
    }
}

class SimpleFactory{
    public Product createProduct(int id){
        Product product;

        if(id == 1){
            return new Product1("刘威甫需要的产品");
        }
        if(id == 2){
            return  new Product2("王二需要的产品");
        }
        return new Product();
    }
}




public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(id);
        product.getProduct();
    }
}
