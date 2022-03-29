package com.interview101;

import java.util.*;

public class BM22 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public int compare (String version1, String version2) {
        // write code here
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
//        System.out.println(Arrays.toString(v1));
//        System.out.println(Arrays.toString(v2));

        int len1 = v1.length;
        int len2 = v2.length;
        int n = Math.max(len1, len2);
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if(i >= len1){
                list1.add(0);
            }
            else {
                list1.add(Integer.parseInt(v1[i]));
            }
        }
        for (int i = 0; i < n; i++) {
            if(i >= len2){
                list2.add(0);
            }
            else {
                list2.add(Integer.parseInt(v2[i]));
            }
        }
//        System.out.println(list1.toString());
//        System.out.println(list2.toString());
        for (int i = 0; i < n; i++) {
            if(list1.get(i) > list2.get(i)){
                return 1;
            }
            else if(list1.get(i) < list2.get(i)){
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.parseInt("0"));
        while (sc.hasNextLine()){
            String v1 = sc.nextLine().trim();
            String v2 = sc.nextLine().trim();
            System.out.println(v1);
            System.out.println(v2);
            BM22 bm22 = new BM22();
            System.out.println(bm22.compare(v1, v2));
        }
    }
}
