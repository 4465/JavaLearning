package com.interview101;

import java.util.*;

import com.interview101.Interval;

public class BM89 {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> ans = new ArrayList<>();
        LinkedList<Interval> list = new LinkedList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start != o2.start){
                    return o1.start - o2.start;
                }
                else {
                    return o1.end - o2.end;
                }
            }
        });

//        System.out.println(intervals.toString());

        for (int i = 0; i < intervals.size(); i++) {
//            System.out.println(intervals.get(i).toString());
            int min = intervals.get(i).start;
            int max = intervals.get(i).end;
            if(list.isEmpty()){
                list.addLast(new Interval(intervals.get(i).start, intervals.get(i).end));
            }
            else {
                Interval temp = list.peekLast();
                if(min >= temp.start && min <= temp.end){
                    list.pollLast();
                    list.addLast(new Interval(Math.min(min, temp.start), Math.max(max, temp.end)));
                }
                else{
                    list.addLast(intervals.get(i));
                }
            }
        }
        while (!list.isEmpty()){
            ans.add(list.pollFirst());
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Interval> intervals = new ArrayList<>();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                intervals.add(new Interval(start, end));
            }
            BM89 bm89 = new BM89();
            bm89.merge(intervals);
        }
    }
}
