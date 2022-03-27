package com.interview101;

import java.util.Scanner;
import java.util.Stack;

public class BM43 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if(stack1.isEmpty()||stack2.peek() > node){
            stack2.push(node);
        }
        else {
            stack2.push(stack2.peek());
        }

    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
//        stack1.pop();
        return stack2.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM43 bm43 = new BM43();
        while (sc.hasNext()){
            String input = sc.nextLine().trim();
            if(input.substring(0,3).equals("PSH")){
                bm43.push(Integer.parseInt(input.substring(3,input.length())));
            }
            else if(input.substring(0,3).equals("POP")){
                bm43.pop();
            }
            else if(input.substring(0,3).equals("MIN")){
                System.out.println(bm43.min());
            }
            else if (input.substring(0,3).equals("TOP")){
                System.out.println(bm43.top());
            }
        }
    }
}
