package com.interview101;


import java.util.*;
/**
 * 数据流中的中位数
 */
public class BM48 {

    private ArrayList<Integer> arr = new ArrayList<>();

    public void Insert(Integer num) {
        arr.add(num);
    }

    public Double GetMedian() {
        int size = arr.size();
        Collections.sort(arr);
        if(size % 2== 1){
            return Double.valueOf(arr.get(size/2));
        }
        else {
            return (arr.get(size/2) + arr.get(size/2 - 1))/2.00;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM48 bm48 = new BM48();
        while (sc.hasNext()){
            bm48.Insert(sc.nextInt());
            System.out.println(bm48.GetMedian());
        }
    }
}
