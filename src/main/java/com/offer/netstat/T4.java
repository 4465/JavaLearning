package com.offer.netstat;
import java.util.*;
public class T4 {
    public int getZeroSum(long res){
        String s = String.valueOf(res);
        int ans = 0;
        for (int i = s.length() -1; i >= 0; i--) {
            if(s.charAt(i) == '0'){
                ans++;
            }
            else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T4 main = new T4();
        while (sc.hasNext()){
            int T = sc.nextInt();
            long[] arr = new long[T];
            for (int i = 0; i < T; i++) {
                arr[i] = sc.nextLong();
            }
            int ans = 0;
            for (int i = 0; i < T; i++) {
                long res = 1;
                for (int j = i; j < T; j++) {
                    if(i == j){
                        res = 1 * arr[j];
                    }
                    else{
                        res *= arr[j];
                    }
                    ans += main.getZeroSum(res);
                }
            }
            System.out.println(ans);
        }
    }
}
