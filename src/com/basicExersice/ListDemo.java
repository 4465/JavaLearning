package com.basicExersice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    //list和Array转换

    public void transformer(){

        List<String> list = List.of("apple", "pear", "banana");
        // list转为array
        //方法一
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }
        //方法二
        String[] array1 = list.toArray(new String[3]);
        for (String n : array1) {
            System.out.println(n);
        }
        //方法3
        String[] array2 = list.toArray(String[]::new);

        //Array转为list
        Integer[] array3 = { 1, 2, 3 };
        List<Integer> list1 = List.of(array3);
        List<Integer> listA= Arrays.asList(array3);
    }

    public static void main(String[] args) {
        List<String> list = List.of("apple", "pear", "banana");

        //不推荐这种遍历方式
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

        //推荐,最高效
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
