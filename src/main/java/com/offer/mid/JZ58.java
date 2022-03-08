package com.offer.mid;

public class JZ58 {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len==0){
            return str;
        }
        n = n%len;
        String a = str.substring(0,n);
        System.out.println(a);
        String b = str.substring(n,str.length());
        String c = b.concat(a);
        return c;
    }

    public static void main(String[] args) {
        JZ58 L = new JZ58();
        String ans = L.LeftRotateString("abcXYZdef", 3);
        System.out.println(ans);
    }
}
