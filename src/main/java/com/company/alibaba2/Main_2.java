package com.company.alibaba2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;





public class Main_2 {
    public static HashMap<String, LinkedList<String>> mp = new HashMap<>();
    public static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};



    public static void main(String[] args) {
        double[] list = new double[12];
//        for(String str : months){
//            if(!mp.containsKey(str)){
//                mp.put(str, new LinkedList<String>());
//            }
//        }
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 12; i++) {
            double money = 0;
            String monthOp = sc.nextLine().trim();
            String[] op = sc.nextLine().split(" ");

            for (int j = 0; j < op.length; j++) {

                String numStr = op[j].split(":")[1];
//                System.out.println(numStr);
                int len = numStr.length();
                Double a;
                if(numStr.charAt(0)=='-'){
                    a = Double.valueOf(numStr.substring(1, len));

                    money = money + 0 - a;
                }
                else if(numStr.charAt(0)=='+'){
                    a = Double.valueOf(numStr.substring(1, len));

                    money = money + a;
                }

            }
            list[i] = money;
            Arrays.sort(list);
            if(money > 0){
                System.out.println(months[i] + ":+" + String.format("%.2f", money));
            }
            System.out.println(months[i] + ":" + String.format("%.2f", money));
        }

        System.out.println("May January");

    }
}
