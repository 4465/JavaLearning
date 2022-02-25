package com.basicExersice;

class Adder{
    private int sum = 0;

    public Adder add(int n){
        sum += n;
        return this;
    }

    public Adder inc(){
        sum ++;
        return this;
    }

    public int value(){
        return sum;
    }
}

public class StringBuilderDemo {
    public void LinkOpOfSB(){
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("bob")
                .append("!")
                .insert(0,"hello, ");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilderDemo SB = new StringBuilderDemo();
        for(int i=0;i<100;i++){
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);
        SB.LinkOpOfSB();

        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .add(4)
                .inc()
                .add(10);
        System.out.println(adder.value());
    }
}
