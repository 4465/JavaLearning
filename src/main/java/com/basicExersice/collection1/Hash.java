package com.basicExersice.collection1;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k = sc.nextInt();
            int h = 1 ^ Integer.valueOf(k).hashCode();
            h ^= (h >>> 20) ^ (h >>> 12);
            h =  h ^ (h >>> 7) ^ (h >>> 4);
            System.out.println(h);

        }
    }
}
