package com.offer.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BM27 {
    public TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
//                TreeNode temp = new TreeNode();
                list.add(null);
            }
            else {
                list.add(new TreeNode(Integer.parseInt(value[i])));
            }
        }

        TreeNode root;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            TreeNode left = list.get(i*2+1) ;

            if(left!=null){
                root.left = left;
            }


            if(i*2+2 <list.size()){
                TreeNode right = list.get(i*2+2);
                if(right!=null){
                    root.right = right;
                }

            }
        }
        return list.get(0);
    }

    public int[] inorder(TreeNode root){
        if(root==null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while(curr!=null||!stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }else {
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);

        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        BM27 tree = new BM27();
        TreeNode root = tree.createTree(input);
        int[] arr = tree.inorder(root);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
