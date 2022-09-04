package com.algorithm.jd;
import java.math.BigInteger;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        BigInteger X = sc.nextBigInteger();
        sc.nextLine();
        String str = sc.nextLine();
        BigInteger ans = X;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'U'){
                ans = ans.divide(BigInteger.valueOf(2));
            }else if(str.charAt(i) == 'R'){
                ans = ans.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
            }
            else if(str.charAt(i) == 'L'){
                ans = ans.multiply(BigInteger.valueOf(2));
            }
        }
        BigInteger aa = new BigInteger("10000000000000000001");
        System.out.println(aa);
        BigInteger[] t = ans.divideAndRemainder(aa);
        System.out.println(t[1]);
//        System.out.println(ans.modPow(BigInteger.valueOf(10), BigInteger.valueOf(18)));
    }
}
