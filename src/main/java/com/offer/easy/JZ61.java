package com.offer.easy;


import java.util.Arrays;

public class JZ61 {
    public boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int[] num = new int[14];
        Arrays.fill(num, 0);
        int min = 0,max = numbers[numbers.length-1];
        int zeros = 0,temp=-1;
        for(Integer a:numbers){
            if(a==temp && a!=0){
                return false;
            }
            else {
                temp = a;
            }

        }
        for(Integer a:numbers)
            if(a==0)
                zeros += 1;
            else
                num[a] = 1;
        if(zeros == 4)
            return true;
        min = numbers[zeros];
//        System.out.println(min);
//        System.out.println(max);
        int cnt = 0;
        for(int i = min;i<=max;i++){

            if(num[i]==0)
                cnt ++;
        }
        if(cnt<=zeros)
            return true;
        else
            return false;

    }

    public static void main(String[] args){
        JZ61 I = new JZ61();
        int[] a = new int[]{1,3,5,0,0};
        I.IsContinuous(a);
    }
}
