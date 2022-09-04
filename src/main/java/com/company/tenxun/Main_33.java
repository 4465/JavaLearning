package com.company.tenxun;

import java.util.Scanner;

public class Main_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        long w = 0, v=0;

        for (int i = 0; i < n; ++i) {
            if(str.charAt(i) == '1'){
                v += i+1;
            }
        }

        long min = v;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                w = w + i + 1;
                long tem = Math.abs(w -v);
                if(min>tem) min = tem;

            }

            else {
                v = v -i -1;
                long temp = Math.abs(w -v);
                if(temp < min)
                    min = temp;

            }
        }
        System.out.println(min);
    }
}
