package com.company.alibaba2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main_22 {
    public static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double[] sum = new double[12];
        for (int i = 0; i < 1; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(":");
            double num = Double.valueOf(arr[1]);
            double cnt = 0;
            for(int j = 0; j<num;j++){
                String s = sc.next();
                String[] detail = s.split(":");
                cnt += Double.valueOf(detail[i]);
            }
            sum[i] = cnt;
        }
        for (int i = 0; i < 12; i++) {
            String fin;
            if(sum[i] >= 0){
                fin = "+" + df.format(sum[i]);
            }
            else{
                fin = df.format(sum[i]);
            }
            System.out.println(months[i] + ":" + fin);
        }
        int maxi = -1, mini = -1;
        double min = Double.MIN_VALUE, max = 0;
        for (int i = 0; i < 12; i++) {
            if(sum[i] > max){
                max = sum[i];
                maxi = i;
            }
            if(sum[i]<min){
                min = sum[i];
                mini = i;
            }
            System.out.println(months[maxi] + " " + months[mini]);
        }
    }
}
