package com.offer.str;

import java.util.Scanner;
import java.util.Stack;

public class JZ73 {
    public String ReverseSentence(String str) {
        if(str.length()==0){
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Stack<String> stack =  new Stack<>();
        String[] ss = str.split(" ");
        for (int i = 0; i < ss.length; i++) {

            stack.push(ss[i]);
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().substring(0,sb.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        JZ73 jz73 = new JZ73();
        jz73.ReverseSentence(input);
    }
}
