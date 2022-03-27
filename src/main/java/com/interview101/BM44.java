package com.interview101;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Stack;

public class BM44 {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if(chs[i] == '{' || chs[i] == '(' || chs[i] == '['){
                stack.push(chs[i]);
            }
            else if(chs[i] == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                else if (stack.pop() != '{' ) {
                    return false;
                }
            }
            else if(chs[i] == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.pop() != '[') {
                    return false;
                }
            }
            else if(chs[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.pop() != '(') {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine().trim();
            System.out.println(new BM44().isValid(input));
        }
    }
}
