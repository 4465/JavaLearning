package com.algorithm;

public class JZ44 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param n int整型
     * @return int整型
     */
    public int findNthDigit (int n) {
        // write code here
        int ans = 0;
        String str = "";
        for(long i=0;i<1000000;i++){
            str = str + i;
        }
        ans = str.charAt(n);
        return ans - 48;
    }

    public static void main(String[] args){
        JZ44 F = new JZ44();
        System.out.println(F.findNthDigit(1000000000));
    }

}
