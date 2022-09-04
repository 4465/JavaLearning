package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


/**
 * 镜像二叉树
 */
public class JZ27 {

    public List<TreeNode> preorder(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).val;
            System.out.println(arr[i]);
        }
        System.out.println("========================");
        return list;
    }

    public void preorder(TreeNode root, List<TreeNode> list){
        if(root==null)
            return;
        list.add(root);
        preorder(root.left, list);
        preorder(root.right, list);
    }


    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode temp;
                temp = node.left;
                node.left = node.right;
                node.right = temp;
                if(node.left!=null)
                    stack.push(node.left);
                if(node.right!=null)
                    stack.push(node.right);
        }
        return pRoot;
    }


    public TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
                list.add(null);
            }
            else {
                list.add((new TreeNode(Integer.parseInt(value[i]))));
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
        Scanner sc = new Scanner((System.in));
        String[] input = sc.nextLine().split(" ");
        JZ27 jz = new JZ27();
        TreeNode root = jz.createTree(input);
//        jz.preorder(root);
        TreeNode pRoot = jz.Mirror(root);
        jz.preorder(pRoot);
    }
}
