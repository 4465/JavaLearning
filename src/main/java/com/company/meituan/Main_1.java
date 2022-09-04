package com.company.meituan;

import java.util.LinkedList;
import java.util.Scanner;
public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int rr = r;
        int bb = b;
        sc.nextLine();
        String str = sc.nextLine().trim();
        int len = str.length();
        char[] chs = str.toCharArray();
        LinkedList<Character> list =new LinkedList<>();
        for (int i = 0; i < chs.length; i++) {
            if(list.isEmpty()){
                list.addLast(chs[i]);
            }
            else{
                if(chs[i] == list.peekLast()){
                    if(list.peekLast() == 'r'){
                        list.addLast('b');
                        b--;
                        list.addLast(chs[i]);
                    }
                    else if(list.peekLast() == 'b') {
                        list.addLast('r');
                        r--;
                        list.addLast(chs[i]);
                    }
                }
                else {
                    list.addLast(chs[i]);
                }
            }
        }
        if(r<0||b<0){
            System.out.println(rr - r + 1 + " " + (bb - b + 1));
        }
        else {
            System.out.println(list.size());
        }
    }
}
