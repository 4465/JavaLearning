package com.offer.tenxun;

import java.util.*;

public class Main_2 {

    HashSet<Integer> set = new HashSet<>();

    public boolean isPrime_1(int n){
        if(n == 1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNumber (int[] a) {
        // write code here
        for(int i = 0; i<=20005;i++){
            if(!isPrime_1(i)){
                set.add(i);
            }
        }
        int n = a.length;
//        LinkedList<Integer> list =new LinkedList<>();
        int[] list = new int[n];

        Arrays.fill(list, 1);
        int count = n;
        while (count > 1){
            int j = 0;
            for (int i = 0; i < n; ++i) {
                if(list[i] == 1){
                    if(!isPrime_1(j+1)){
                        list[i] = 0;
                        count--;
                    }
                    j++;
                }
            }
        }
        int out = 0;
        for (int i = 0; i < n; ++i) {
            if(list[i] == 1){
                out = i;
                break;
            }
        }
        return a[out];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main_2  main = new Main_2();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = main.getNumber(arr);
        System.out.println(ans);
    }
}
