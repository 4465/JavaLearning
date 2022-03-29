package com.interview101;


import java.util.*;
public class BM49 {
    
    public ArrayList<Integer> function(String s, int index){
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';
        int i;
        for (i = index; i < n; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num*10 + s.charAt(i) - '0';
                if(i!=n-1){
                    continue;
                }
            }
            if(s.charAt(i) == '('){
                ArrayList<Integer> res = function(s, i + 1);
                num = res.get(0);
                i = res.get(1);
                if(i!=n-1){
                    continue;
                }
            }
            switch (op){
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    stack.push(-num);
                    break;
                case '*':
                    int temp = stack.pop();
                    stack.push(temp*num);
                    break;
            }
            num = 0;
            if(s.charAt(i) == ')'){
                break;
            }
            else{
                op = s.charAt(i);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(sum);
        temp.add(i);
        return temp;
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回表达式的值
     * @param s string字符串 待计算的表达式
     * @return int整型
     */
    public int solve (String s) {
        // write code here
       ArrayList<Integer> res = function(s, 0);
       return res.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            BM49 bm49 = new BM49();
            System.out.println(bm49.solve(str));
        }
    }
}
