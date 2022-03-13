package com.basicExersice.template;


//泛型
class Point<T>{
    private T var;

    public T getVar(){
        return var;
    }

    public void setVar(T var){
        this.var = var;
    }
}

//多元泛型
class Notepad<K,V>{
    private K key;
    private V value;
    public K getKey(){
        return this.key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }
}

interface Info<T>{
    public T getVar();
}

class InfoImpl<T> implements  Info<T>{
    private T var;
    public InfoImpl(T var){
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return var;
    }
}


public class TemplateDemo {
    public static void main(String[] args) {
        Point<String> p = new Point<String>();

        p.setVar("it");

        System.out.println(p.getVar().length());


        System.out.println("========================");
        Notepad<String,Integer> t= null;
        t = new Notepad<String, Integer>();
        t.setKey("汤姆");
        t.setValue(20);
        System.out.println(t.getKey());
        System.out.println(t.getValue());


        System.out.println("========================");

        Info<String> i = null;
        i = new InfoImpl<String>("汤姆");
        System.out.println(i.getVar());
    }
}



