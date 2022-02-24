package com.basicExersice;


public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getData(){
        return val;
    }

    public void setData(int val){
        this.val = val;
    }

    public TreeNode getLeftChild(){
        return left;
    }

    public void setLeftChild(TreeNode leftChild){
        this.left = leftChild;
    }

    public TreeNode getRightChild(){
        return right;
    }

    public void setRightChild(TreeNode rightChild){
        this.right = rightChild;
    }
}
