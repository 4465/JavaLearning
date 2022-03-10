package com.offer.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Tree{
    // 前序(根-左-右)遍历的方法
    public void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public int[] preorderTraversal (TreeNode root) {
        // write code here
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }

        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
                TreeNode temp = new TreeNode();
                list.add(temp);
            }
            else{
                TreeNode temp = new TreeNode(Integer.parseInt(value[i]));
                list.add(temp);
            }

        }

        TreeNode root;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            TreeNode left = list.get(i*2+1);
            root.left = left;

            if(i*2+2<list.size()){
                TreeNode right = list.get(i*2+2);
                root.right = right;
            }
        }
        return list.get(0);
    }


}


public class BM23 {


    public static void main(String[] args) throws IOException {
        System.out.println();
        int[] value = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] input = str.split(" ");

//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
        Tree tree = new Tree();
        TreeNode root = Tree.createTree(input);
        tree.preOrder(root);

    }
}


