package com.offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//二叉树中和为某一值的路径(一)
//DFS
public class JZ82 {


    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        return dfs(root, sum, 0);
    }

    public boolean dfs(TreeNode root, int sum, int m_sum){
        if(root.left==null&&root.left==null){
            if(m_sum + root.val == sum){
                return true;
            }
        }

        m_sum += root.val;
        boolean flag = false;
        if(root.left!=null){
            flag = dfs(root.left, sum, m_sum);
        }
        if(root.right!=null){
            flag = dfs(root.right, sum, m_sum);
        }
        return flag;
    }

    public boolean hasPathSum2 (TreeNode root, int sum) {
        // write code here
        if(root == null){
            return false;
        }
        if(root.left==null&&root.right==null&&sum-root.val==0) {
            return true;
        }
        return hasPathSum2(root.left, sum - root.val) || hasPathSum2(root.right, sum - root.val);
    }

    public TreeNode createTree(String[] value){
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {
            if(value[i].equals("#")){
                list.add(null);
            }else {
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
        JZ82 jz82 = new JZ82();
        TreeNode root = jz82.createTree(input);
        jz82.hasPathSum(root, input.length);
    }
}
