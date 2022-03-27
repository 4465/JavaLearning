package com.interview101;

import java.util.Scanner;
import java.util.Stack;

public class BM42 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM42 bm42 = new BM42();
        while (sc.hasNext()){
            String input = sc.nextLine().trim();
//            System.out.println(input.substring(0,3));
            if(input.substring(0,3).equals("PSH")){
//                System.out.println("入栈");
                bm42.push(Integer.parseInt(input.substring(3, input.length())));
            }
            if(input.substring(0,3).equals("POP")){
                System.out.println(bm42.pop());
            }
        }
    }
}
