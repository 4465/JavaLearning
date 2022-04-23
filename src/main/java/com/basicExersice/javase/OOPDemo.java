package com.basicExersice.javase;

class Parent{
    private String name;
    private int age;
    private double height;
    private double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print(){
        System.out.println("我是父亲");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}


class Son extends Parent{
    @Override
    public void print() {
        System.out.println("我是儿子");
    }

    public void fight(){
        System.out.println("我是儿子，我昨天打架了");
    }
}

class Daughter extends Parent{
    @Override
    public void print() {
        System.out.println("我是女儿");
    }
}


public class OOPDemo {




    public static void main(String[] args) {
        Parent son  = new Son();
        son.print();

        Parent daughter = new Daughter();
        daughter.print();

        Parent parent = new Parent();
        parent.print();

        Son son1 = new Son();
        son1.fight();
    }
}
