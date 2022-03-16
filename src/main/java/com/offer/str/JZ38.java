package com.offer.str;

import java.util.*;

public class JZ38 {
    ArrayList<String> res = new ArrayList<>();
    char[] c;
    public ArrayList<String> Permutation(String str) {
        c = str.toCharArray();
        dfs(0);
        return res;
    }

    void dfs(int x){
        if(x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            if(set.contains(c[i])){
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    void swap(int a,int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        JZ38 jz38 = new JZ38();
        jz38.Permutation(input);
    }
}
