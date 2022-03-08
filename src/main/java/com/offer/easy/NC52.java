package com.offer.easy;

import java.util.Stack;

public class NC52 {
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            if((s.charAt(i) == '}'||s.charAt(i)==']'||s.charAt(i)==')')){
                if(!stack.isEmpty()){
                    if(s.charAt(i) == ')'){
                        Character ch = stack.pop();
                        if(ch!='(')
                            return false;
                    }
                    if(s.charAt(i) == ']'){
                        Character ch = stack.pop();
                        if(ch!='[')
                            return false;
                    }
                    if(s.charAt(i) == '}'){
                        Character ch = stack.pop();
                        if(ch!='{')
                            return false;
                    }
                }
                else {
                    return false;
                }
            }

        }
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
