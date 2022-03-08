package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList02 {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(88);
        myNumbers.add(77);
        for(int i : myNumbers){
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
    }
}
