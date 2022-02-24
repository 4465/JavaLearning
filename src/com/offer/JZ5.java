package com.offer;

import java.util.*;

public class JZ5 {
    public String replaceSpace (String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                res = res + "%20";
            }
            else{
                res = res + s.charAt(i);
            }
        }
        return res;
    }
}
