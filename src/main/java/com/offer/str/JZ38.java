package com.offer.str;

import java.util.ArrayList;
import java.util.Scanner;

public class JZ38 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        char[] chs = str.toCharArray();


        return null;
    }

    public void Permutation(String str, int i, ArrayList<String> list){
        if(i==0){
            return ;
        }
        Permutation(str, i-1 ,list);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        JZ38 jz38 = new JZ38();
        jz38.Permutation(input);
    }
}
