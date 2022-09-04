package com.algorithm.easy;

public class JZ69 {
    public int jumpFloor(int target) {
        if(target==1 || target==0)
            return 1;
        else{
            return jumpFloor(target-1) + jumpFloor(target-2);
        }
    }

    public static void main(String[] args){
        JZ69 J = new JZ69();
        J.jumpFloor(2);
    }
}
