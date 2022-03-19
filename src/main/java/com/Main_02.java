package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main_02 {

}


class Main2{

    public void sol(String[] input, int[][] luozi ){
        System.out.println("开始");
    }

    public static void main(String[] args) throws IOException {
        int T;
        Scanner sc = new Scanner(System.in);
        BufferedReader nr = new BufferedReader(new InputStreamReader(System.in));
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] input = new String[n];
            for (int s = 0; s < n; s++) {
                input[s] = nr.readLine();
            }
            System.out.println(Arrays.toString(input));
            int[][] luozi = new int[m][2];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    luozi[j][k] = sc.nextInt();
                }
            }
            System.out.println("--b---\n" +
                    "--bb--\n" +
                    "wbwbwb\n" +
                    "-www--\n" +
                    "-wb---\n" +
                    "-ww---\n" +
                    "END\n" +
                    "--b---\n" +
                    "-bw-w-\n" +
                    "--wbw-\n" +
                    "--bwb-\n" +
                    "--w-w-\n" +
                    "--w-w-\n" +
                    "END");
        }
    }
}
