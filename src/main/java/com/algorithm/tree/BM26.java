package com.algorithm.tree;

import java.util.*;

public class BM26 {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> ans =  new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return ans;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> row = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                row.add(node.val);
//                System.out.println(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(row);
        }
        return ans;
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
//            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        BM26 tree = new BM26();
        TreeNode root =tree.createTree(input);
//        int[] arr = tree.inorder(root);
        tree.levelOrder(root);
    }
}
