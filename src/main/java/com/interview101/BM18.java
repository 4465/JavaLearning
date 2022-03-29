package com.interview101;

import java.util.*;

public class BM18 {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0 || array[0].length == 0){
            return false;
        }
        int lenRow = array.length;
        int lenCol = array[0].length;
        for (int i = lenRow - 1, j = 0 ; i >= 0 && j < lenCol;) {
            if(array[i][j] > target){
                i--;
            }
            else if(array[i][j] < target){
                j++;
            }
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        BM18 bm18 = new BM18();
        System.out.println(bm18.Find(k, arr));
    }
}
