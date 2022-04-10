package com.interview101;

import com.offer.tree.TreeNode;

import java.util.*;

public class BM27 {
    public void preorder(TreeNode root){
        LinkedList<Integer> list = new LinkedList<>();
        preorder(root, list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void preorder(TreeNode root, LinkedList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    public TreeNode createTree(String[] values){
        LinkedList<TreeNode> list = new LinkedList<>();
        for (int i = 0; i < values.length; i++) {
            if(values[i].equals("#")){
                list.add(null);
            }
            else{
                list.add(new TreeNode(Integer.parseInt(values[i])));
            }
        }

        TreeNode root;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            TreeNode left = list.get(i*2+1);
            if(left != null){
                root.left = left;
            }
            if(i*2+2<list.size()){
                TreeNode right = list.get(i*2+2);
                if(right != null){
                    root.right = right;
                }
            }
        }
        return list.get(0);
    }


    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(pRoot == null){
            return null;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addLast(pRoot);
        boolean flag = true;
        while(!list.isEmpty()){
            int size = list.size();
            flag = !flag;
            ArrayList<Integer> res = new ArrayList<>();
            System.out.println(flag);
            for(int i = 0;i<size; i++){
                TreeNode node = list.pollFirst();
                res.add(node.val);
                if(node.left != null){
                    list.offerLast(node.left);
                }
                if(node.right != null){
                    list.offerLast(node.right);
                }
            }
            if(flag){
                Collections.reverse(res);
            }
            ans.add(res);
        }
//        System.out.println(ans.toArray().toString());
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM27 bm27 = new BM27();
        String[] params = sc.nextLine().trim().split(" ");
        TreeNode root = bm27.createTree(params);
        bm27.preorder(root);
        bm27.Print(root);
    }
}
