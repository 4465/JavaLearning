package com.algorithm.jd;

import java.util.*;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine().trim();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            if(map.get('A') == n && map.get('B') == n && map.get('C') == n){
                System.out.println(0);
                continue;
            }
            if(map.get('A') > n && map.get('B') < n && map.get('C') < n){
                System.out.println(2);
                continue;
            }
            if(map.get('A')<n && map.get('B')<n&&map.get('C')>n){
                System.out.println(2);
                continue;
            }

            if(map.get('A')>n && map.get('B')>n&&map.get('C')<n){
                System.out.println(1);
                continue;
            }
            if(map.get('A')>n && map.get('B')<n&&map.get('C')>n){
                System.out.println(2);
                continue;
            }
            if(map.get('A')<n && map.get('B')>n&&map.get('C')>n){
                System.out.println(2);
                continue;
            }

        }

    }
}
