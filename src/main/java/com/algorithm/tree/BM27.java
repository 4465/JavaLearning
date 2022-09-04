package com.algorithm.tree;

import java.util.*;

public class BM27 {

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(pRoot);
        stack.push(pRoot);
        //从右边开始打印
        boolean flag = false;
        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

            }
            for (int i = 0; i < stack.size(); i++) {
                TreeNode node = stack.pop();
                if(flag){
                    if(node.left!=null){
                        stack.push(node.left);
                        queue.add(node.left);
                    }
                    if(node.right!=null){
                        stack.push(node.right);
                        queue.add(node.right);
                    }

                }
                else{
                    if(node.right!=null){
                        stack.push(node.right);
                        queue.add(node.right);
                    }
                    if(node.left!=null){
                        stack.push(node.left);
                        queue.add(node.left);
                    }
                }
            }

            flag = !flag;
            ans.add(level);
        }
        return  ans;
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
            root = list.get(0);

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
        BM27 tree = new BM27();
        TreeNode root = tree.createTree(input);
    }

}
