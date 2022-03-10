package com.offer.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;



public class CD175 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //构建二叉树
        String[] params = br.readLine().split(" ");
        int n = Integer.parseInt(params[0]);
        TreeNode root = new TreeNode(Integer.parseInt(params[1]));
        HashMap<Integer, TreeNode> map = new HashMap<>();

        map.put(root.val, root);

        for (int i = 0; i < n; i++) {
            params = br.readLine().split(" ");
            int val = Integer.parseInt(params[0]);
            int leftVal = Integer.parseInt(params[1]);
            int rightVal = Integer.parseInt(params[2]);
            TreeNode node = map.get(val);
            if(leftVal!=0){
                node.left = new TreeNode(leftVal);
                map.put(leftVal, node.left);
            }
            if(rightVal!=0){
                node.right = new TreeNode(rightVal);
                map.put(rightVal,node.right);
            }
        }
        //获取最近公共祖先
        params = br.readLine().split(" ");
        TreeNode p = map.get(Integer.parseInt(params[0]));
        TreeNode q = map.get(Integer.parseInt(params[1]));
        System.out.println(lowestCommonAncestor(root, p, q).val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        HashMap<TreeNode, TreeNode> child2parent = new HashMap<>();
        child2parent.put(root, root);   //根的父节点是自己
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                queue.offer(node.left);
                child2parent.put(node.left,node);
            }
            if(node.right!=null){
                queue.offer(node.right);
                child2parent.put(node.right, node);
            }
        }
        if(child2parent.get(p)==child2parent.get(q)) return child2parent.get(p);
        //先记录p网上的路径
        HashSet<TreeNode> memory = new HashSet<>();
        memory.add(p);
        while(child2parent.get(p) != p){
            memory.add(child2parent.get(p));
            p = child2parent.get(p);
        }
        // 然后再从q往上找最先与路径相交的节点
        while(!memory.contains(q)) q = child2parent.get(q);
        return q;

    }

}


