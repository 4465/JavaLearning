package com.offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LC559 {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < 0; i++) {
            
        }
        return  ans;
    }

    public TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<TreeNode>();
        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
                list.add(null);
            }
            else {
                list.add(new TreeNode(Integer.parseInt(value[i])));
            }
        }
        TreeNode root;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            TreeNode left = list.get(i*2+1);
            if(left!=null){
                root.left = left;
            }
            if(i*2+2<list.size()){
                TreeNode right = list.get(i*2+2);
                if(right!=null){
                    root.right = right;
                }
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        LC559 lc = new LC559();

    }

}
