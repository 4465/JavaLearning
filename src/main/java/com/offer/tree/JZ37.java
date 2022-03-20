package com.offer.tree;

import java.util.*;

public class JZ37 {

    public static String Serialize(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        InOrder(root, list);
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).val == -1){
                str += "# ";
            }
            else {
                str += list.get(i).val + " ";
            }
        }
        System.out.println(str.trim());
        return str.trim();
    }

    public static void InOrder(TreeNode root, List list){
        if(root == null) {
            if(root.left==null && root.right == null){
                return;
            }
            list.add(new TreeNode(-1));
            return;
        }
        InOrder(root.left, list);
        list.add(root);
        InOrder(root.right, list);
    }

    public static TreeNode Deserialize(String str) {
        String[] input = str.split(" ");
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if(input[i].equals("#")){
                list.add(null);
            }
            else {
                list.add(new TreeNode(Integer.parseInt(input[i])));
            }
        }
        TreeNode root;
        TreeNode left;
        TreeNode right;
        for (int i = 0; i < list.size()/2; i++) {
            root = list.get(i);
            left = list.get(i*2+1) ;
            if(left!=null){
                root.left = left;
            }
            if(i*2+2<=list.size()){
                right = list.get(i*2+2);
                if(right!=null){
                    root.right = right;
                }
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        TreeNode root = JZ37.Deserialize(str);
        JZ37.Serialize(root);
    }
}
