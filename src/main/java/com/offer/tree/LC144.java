package com.offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        preorderTraversal(root, list);
        return list;
    }

    static void preorderTraversal(TreeNode node, ArrayList<Integer> list){
        if(node==null){
            return;
        }
        list.add(node.val);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
    }

    static List<Integer> preorderIter(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return  list;
        }
        stack.add(root);

        while(!stack.isEmpty()){
           TreeNode node = stack.pop();
           list.add(node.val);
           if(node.right!=null){
                stack.push(node.right);
           }
           if(node.left!=null){
               stack.push(node.left);
           }

        }

        return list;
    }

    static List<Integer> postorderIter(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return  list;
        }
        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }

        }

        return list;
    }
}
