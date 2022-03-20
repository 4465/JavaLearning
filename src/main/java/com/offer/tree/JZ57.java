package com.offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JZ57 {

    public static int KthNode (TreeNode proot, int k) {
        // write code here
        if(proot == null)
            return -1;
        List<TreeNode> list = new ArrayList<>();
        inOrder(proot, list);
        System.out.println(list);
        if(k<list.size()&&k>0)
            return list.get(k-1).val;
        else
            return -1;
    }

    public static void inOrder(TreeNode root, List list){
        if(root==null)
            return;
        else{
            inOrder(root.left, list);
            list.add(root);
            inOrder(root.right,list);
        }
    }


    public static TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
                list.add(null);
            }
            else
                list.add(new TreeNode(Integer.parseInt(value[i])));
        }
        TreeNode root;
        TreeNode left;
        TreeNode right;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            left = list.get(i*2+1);
            if(left!=null){
                root.left = left;
            }
            if(i*2+2<list.size()){
                right = list.get(i*2+2);
                if(right!=null){
                    root.right = right;
                }
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k;
        k = sc.nextInt();
        TreeNode root = JZ57.createTree(input);
        int ans = JZ57.KthNode(root, k);
        System.out.println(ans);
    }
}
