package com.basicExersice.string;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public void commonStrAdd(){
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
    }

    public void AddOfSJ(){
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(",");
        for(String name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());
        var sj01 = new StringJoiner(",","hello ","!");
        for(String name:names){
            sj01.add(name);
        }
        System.out.println(sj01.toString());
        System.out.println(String.join("," , names));
    }

    public static void main(String[] args) {
        StringJoinerDemo SJ = new StringJoinerDemo();
        SJ.commonStrAdd();
        SJ.AddOfSJ();
    }
}
