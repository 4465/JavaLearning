package com.offer.eachina;

import com.offer.tree.TreeNode;

import java.util.*;

public class Main_1 {
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }

        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int minCameraCover(TreeNode root) {
        int[] array = dfs(root);
        return array[1];
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE / 2, 0, 0};
        }
        int[] leftArray = dfs(root.left);
        int[] rightArray = dfs(root.right);
        int[] array = new int[3];
        array[0] = leftArray[2] + rightArray[2] + 1;
        array[1] = Math.min(array[0], Math.min(leftArray[0] + rightArray[1], rightArray[0] + leftArray[1]));
        array[2] = Math.min(array[0], leftArray[1] + rightArray[1]);
        return array;
    }

    public TreeNode createTree(int[] value){
        List<TreeNode> list = new LinkedList<>();
        for (int i = 0; i < value.length; i++) {
            if(value[i]==-1){
                list.add(null);
            }
            else {
                list.add(new TreeNode(value[i]));
            }
        }
        TreeNode root;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            if(root != null){
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
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main_1 main = new Main_1();
        TreeNode root = main.createTree(arr);
        int ans = main.minCameraCover(root);
        System.out.println(ans);
    }
}
