package com.algorithm.easy;

import java.util.Stack;

public class BM83 {
    public String trans(String s, int n) {

        // write code here
        //使用栈的特性，输出为反向
        Stack<String>stack=new Stack<>();
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<n;i++){
            //遇到空格入栈
            if(s.charAt(i)==' '){
                stack.push(buffer.toString());
                buffer.delete(0,buffer.length());
            }else{
                //小写字母-32转为大写
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    buffer.append((char)(s.charAt(i)-32));
                }else{
                    //大写字母+32转为小写
                    buffer.append((char)(s.charAt(i)+32));
                }
            }
        }
        //最后一个单词入栈
        stack.push(buffer.toString());
        StringBuffer ans=new StringBuffer();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
            //每个单词后接空格
            ans.append(' ');
        }
        //删除最后一个多余空格
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();

    }

    public static void main(String[] args) {
        String s = "This is a sample";
        BM83 T = new BM83();
        System.out.println(T.trans(s, 16).length());

    }
}
