package com.offer.jd;
import java.util.*;
public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();
            sc.nextLine();
            Stack<String> stack = new Stack<String>();
            LinkedList<String> list = new LinkedList<>();
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine();
                list.add(str);
            }
            for (int i = 0; i < list.size(); i++) {
                String[] s = list.get(i).trim().split(" ");
                if(s.length == 1){
                    stack.push(s[0].trim());
                }
                else if(s.length == 2){
                    if(stack.isEmpty()){
                       flag = !flag;
                       break;
                    }
                    String temp = stack.pop();
                    if(temp.equals(s[1].trim()) == false){
                        flag = !flag;
                        break;
                    }
                }
            }
            if(flag == true && stack.isEmpty()){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}