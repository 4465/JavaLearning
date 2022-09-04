package com.algorithm.tree;


/**
 * 求二叉树的最大深度
 */
public class BM28 {

    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null)
            return 0;
        return getDepth(root);

    }


    public int getDepth(TreeNode root){
        int depth;
        if(root==null)
            return 0;
        else{
            depth = 1 + Math.max(getDepth(root.left),getDepth(root.right));
        }
        return depth;
    }

    public static void main(String[] args) {

    }

}
