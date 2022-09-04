package com.company.alibaba2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1 {
    private static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int num = 0;
        String chars = sc.nextLine();
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < j; i++) {
                num++;
                if(i==0){
                    if(diffNumOfChars(chars.substring(j, n)) >=k) res++;
                }else if (j==n){
                    if(diffNumOfChars(chars.substring(0,i)) >=k) res++;
                }else{
                    if(diffNumOfChars(chars.substring(0, i) + chars.substring(j, n))>=k) res++;
                }
            }
        }
        System.out.println("num = " + num);
        System.out.println(res);
    }

    public static int diffNumOfChars(String chars){
        List<Character> list = new ArrayList<>();
        for(char c:chars.toCharArray()){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        return list.size();
    }
}
