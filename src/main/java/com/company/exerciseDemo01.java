package com.company;
import java.util.Scanner;

public class exerciseDemo01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int preScore = sc.nextInt();
        int nowScore = sc.nextInt();

        double rate = 1.0*(nowScore - preScore) / preScore;

        System.out.format("%.2f", 1.0*(nowScore - preScore) / preScore);
    }
}
