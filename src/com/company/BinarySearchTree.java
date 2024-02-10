package com.company;

public class BinarySearchTree {

    public static TreeNode ceilOfNode(TreeNode root, int x){
        TreeNode res = null;
        while (root != null){
            if (root.key == x){
                return root;
            }
            else if(root.key < x){
                root = root.right;
            }
            else {
                res = root;
                root = root.left;
            }
        }

        return res;
    }

    public static TreeNode floorOfNode(TreeNode root, int x){

        TreeNode res = null;
        if(root == null){
            return null;
        }

        while (root != null){
            if (root.key == x){
                return root;
            }
            else if(root.key > x){
                root = root.left;
            }

            else {
                res = root;
                root = root.right;
            }
        }

        return res;

    }
    public static void main(String[] args) {

        TreeNode bst = new TreeNode(50);
        bst.left = new TreeNode(30);
        bst.left.left = new TreeNode(20);
        bst.left.right = new TreeNode(40);
        bst.right = new TreeNode(70);
        bst.right.left = new TreeNode(60);
        bst.right.right = new TreeNode(80);
        bst.right.left.left = new TreeNode(55);
        bst.right.left.right = new TreeNode(65);

        System.out.println(floorOfNode(bst,58).key);
        System.out.println(ceilOfNode(bst,58).key);
    }
}
