package com.offer.bianlifeng;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Pair{
    int width;
    int height;
}

public class Main_3 {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        String s = null;
        LinkedList<Pair> list = new LinkedList<>();
        while(!(s = sc.nextLine()).equals("")){
            String[] params = s.split(" ");
            Pair pair = new Pair();
            pair.width = Integer.parseInt(params[0]);
            pair.height = Integer.parseInt(params[1]);
            list.add(pair);

        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).width + " " + list.get(i).height);
//        }
    }
}
