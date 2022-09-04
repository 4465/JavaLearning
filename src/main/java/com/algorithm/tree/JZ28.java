package com.algorithm.tree;

import java.util.*;

public class JZ28 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            if(size%2==1)
                return false;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                queue2.add(t);
                list.add(t.val);
            }

            for (int i = 0; i < size/2; i++) {
                System.out.println(list.get(i) + ":" + list.get(size-1-i));
                if(list.get(i) != list.get(size-1-i))
                    return false;
            }
            for (int i = 0; i < size; i++) {
                TreeNode node = queue2.poll();

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }

        }
        return true;
    }

    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
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
        JZ28 jz = new JZ28();
        TreeNode root = jz.createTree(input);
        jz.isSymmetrical(root);
    }
}
