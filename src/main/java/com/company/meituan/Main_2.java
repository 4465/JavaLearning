package com.company.meituan;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        int l = 0;
        int r = n -1;
        int count = 0;
        while (l<r){
            if(arr[l+1] > arr[l]){
                l++;
            }else if(arr[l+1] < arr[l]){
                count += (arr[l] - arr[l+1] + 1);
                arr[l+1] = arr[l+1] + (arr[l] - arr[l+1] + 1);
                l++;
            }

            else if(arr[l+1] == arr[l]){
                arr[l+1] += 1;
                count+=1;
                l++;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            if(arr[r-1] > arr[r] ){
                r--;
            }else if(arr[r-1] < arr[r]){
                count += (arr[r] - arr[r-1] + 1);
                arr[r-1] = arr[r-1] + arr[r] - arr[r-1] + 1;
                r--;
            }
            else if(arr[r-1] == arr[r]){
                arr[r-1] += 1;
                r--;
                count+=1;
            }
        }
        System.out.println(count);
    }
}
