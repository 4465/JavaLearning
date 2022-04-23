package com.offer.netstat;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}

public class Main_1 {
    int max = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    public TreeNode dfs(int[] inorder,int inleft,int inright,int[] postorder,int postleft,int postright){
        if(inleft > inright || postleft > postright){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postright]);
        for(int i = inleft;i<=inright;i++){
            if(postorder[postright] == inorder[i]){
                root.left = dfs(inorder,inleft,i-1,postorder,postleft,postleft+i-inleft-1);
                root.right = dfs(inorder,i+1,inright,postorder,postleft+i-inleft,postright-1);
            }
        }
        return root;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        getMax(root);
        return max;
    }

    public int getMax(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftMax = 0;
        int rightMax = 0;
        if(node.left != null){
            leftMax = getMax(node.left);
        }
        if(node.right != null){
            rightMax = getMax(node.right);
        }
        max = Math.max(leftMax + rightMax, max);
        return Math.max(leftMax, rightMax) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] pre = new int[T];
        int[] vin = new int[T];
        for (int i = 0; i < T; i++) {
            pre[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            vin[i] = sc.nextInt();
        }
        Main_1 main = new Main_1();
        TreeNode root = main.buildTree(pre, vin);
        int ans = main.diameterOfBinaryTree(root);
        System.out.println(ans);
    }
}
