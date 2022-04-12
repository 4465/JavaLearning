package com.offer.weBank;

import java.util.*;

public class Main_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim();
        long cnt = 0;
        Set<Integer>[] set = new Set[n];
        for (int i = 0; i < n; i++) {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i <= n; i++) {
            int remainder = 0;
            int prefixesFound = 0;
            for (int j = i; j <= n; j++) {
                remainder = (10*remainder + (str.charAt(j-1) - '0')) % m;
                if(set[j-1].contains(remainder)){
                    break;
                }
                else {
                    set[j-1].add(remainder);
                }
                if(remainder == 0){
                    prefixesFound++;
                }
            }
            cnt += prefixesFound * (prefixesFound + 1);
        }
        System.out.println(cnt);
    }
}
