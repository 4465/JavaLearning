package com.basicExersice.generics;

interface genericInterface<T> {
    public T getVar();

    public void setVar(T var);
}

public class ImpDemo<T> implements genericInterface<T> {
    private T var;

    @Override
    public void setVar(T var) {
        this.var = var;
    }


    @Override
    public T getVar() {
        return var;
    }



    public static void main(String[] args) {
        genericInterface<String> i = null;
        i = new ImpDemo<>();
        i.setVar("fssd");
        System.out.println(i.getVar());
    }
}
