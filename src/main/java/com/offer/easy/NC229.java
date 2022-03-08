package com.offer.easy;

import java.util.HashMap;

public class NC229 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return bool布尔型
     */
    public boolean isUnique (String str) {
        // write code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                return false;
            }
            else {
                map.put(ch, 1);
            }
        }
        return true;
    }
}
