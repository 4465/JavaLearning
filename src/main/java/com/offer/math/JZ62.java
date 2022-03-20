package com.offer.math;

import java.util.*;

public class JZ62 {
    public static int LastRemaining_Solution(int n, int m) {
        if(n<=0||m<=0)
            return -1;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int removeIndex = 0;
        while (list.size()>1){
            removeIndex = (removeIndex + m -1)% list.size();
            list.remove(removeIndex);
        }
        System.out.println(list.get(0));
        return list.get(0);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            JZ62.LastRemaining_Solution(n,m);

            T--;
        }
    }
}
