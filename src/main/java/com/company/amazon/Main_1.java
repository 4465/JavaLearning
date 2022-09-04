package com.company.amazon;

import java.util.*;

public class Main_1 {
    public static int getMinimumTrips(List<Integer> weights) {
        // Write your code here
//        System.out.println("run....");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < weights.size(); i++) {
            if(map.containsKey(weights.get(i))){
                map.put(weights.get(i), map.get(weights.get(i)) + 1);
            }
            else{
                map.put(weights.get(i) , 1);
            }
        }
//
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
            if(m.getValue() % 3 != 0 && m.getValue() % 2 != 0){
                return -1;
            }
        }

        int size = map.size();
        int count = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            while (m.getValue() % 3 == 0){
//                System.out.println("3:" + m.getValue());
                if(m.getValue() == 0){
                    break;
                }

                if(m.getValue() - 3 == 0){
//                    map.remove(m.getKey());
                    map.put(m.getKey(), 0);
                    count++;
                    break;
                }
                else {
                    map.put(m.getKey(), map.get(m.getKey()) - 3);
                    count++;
                }
            }
            while (m.getValue() % 2 == 0){
                if(m.getValue() == 0){
                    break;
                }
//                System.out.println("2：" + m.getValue());
                if(m.getValue() - 2 == 0){
                    map.put(m.getKey(), 0);
                    count++;
                    break;
                }
                else {
                    map.put(m.getKey(), map.get(m.getKey()) - 2);
                    count++;
                }
            }
        }
        boolean flag = true;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
//            System.out.print(m.getValue() + " ");
            if(m.getValue()!=0){
                flag = !flag;
                break;
            }

        }
//        System.out.println();

        if(flag){
            return count;
        }
        else {
            return  -1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().trim().split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < params.length; i++) {
            list.add(Integer.parseInt(params[i]));
        }
        int a =Main_1.getMinimumTrips(list);
        System.out.println(a);
    }
}
