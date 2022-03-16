package com.offer.alibaba;


import java.util.*;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Main_01 {
    // 前序(根-左-右)遍历的方法
    public void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public int[] preorder(TreeNode root){
        return null;
    }


    public int sol(TreeNode root){

        if(root.left==null&&root.right==null) {
            return 1;
        }
        int ans=0;
        if(root==null){
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){

            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.left == null && node.right==null){
                ans +=1;
            }
            else {
                if(node.left!=null){
                    stack.push(node.left);
                }
                if(node.right!=null){
                    stack.push(node.right);
                }
            }
        }
        return ans;
    }

    public TreeNode createTree(int[] arr){
        List<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1){
                list.add(null);
            }
            else{
                list.add(new TreeNode(arr[i]));
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Main_01 my = new Main_01();
        TreeNode root = my.createTree(arr);
        int ans=0;
        my.preorder(root);
        ans = my.sol(root);
        System.out.println(ans);


    }

}
