//package com.company;
//
//import java.util.ArrayDeque;
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//
//class TreeNode{
//    int key;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x){
//        key = x;
//    }
//}
//
//public class BinaryTree {
//
//    public static void InorderTraversal(TreeNode root){
//        if(root != null){
//            InorderTraversal(root.left);
//            System.out.println(root.key);
//            InorderTraversal(root.right);
//        }
//    }
//
//    public static void PreorderTraversal(TreeNode root){
//        if (root != null){
//            System.out.println(root.key);
//            PreorderTraversal(root.left);
//            PreorderTraversal(root.right);
//        }
//    }
//
//    public static void PostorderTraversal(TreeNode root){
//        if (root != null){
//            PreorderTraversal(root.left);
//            PreorderTraversal(root.right);
//            System.out.println(root.key);
//        }
//    }
//
//    public static int TreeHeight(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        else{
//            return Math.max(TreeHeight(root.left),TreeHeight(root.right)) + 1;
//        }
//    }
//
//    public static void NodeAtKDistance(TreeNode root, int k){
//        if(root == null){
//            return;
//        }
//        if (k == 0){
//            System.out.println(root.key);
//        }
//        else {
//            NodeAtKDistance(root.left,k-1);
//            NodeAtKDistance(root.right,k-1);
//        }
//    }
//
//    public static void LevelOrderTraversal(TreeNode root){
//        if (root == null){
//            return;
//        }
//
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
////        Queue<TreeNode> q = LinkedList<>();
//        q.offer(root);
//
//        while (!q.isEmpty()){
//            TreeNode cur = q.poll();
//            System.out.println(cur.key);
//            if (cur.left != null){
//                q.offer(cur.left);
//            }
//            if (cur.right != null){
//                q.offer(cur.right);
//            }
//        }
//    }
//
//
//
//    // Will not work, null can not be inserted
//
////    public static void LevelOrderTraversalLineByLine(TreeNode root){
////        if (root == null){
////            return;
////        }
////        ArrayDeque<TreeNode> q = new ArrayDeque<>();
////        TreeNode temp = new TreeNode(-1);
////
////        q.offer(root);
//////        q.offer(null);
////        q.add(temp.left);
////        while (q.size() > 1){
////            TreeNode cur = root;
////            if(cur == null){
////                System.out.println();
////                q.offer(temp.left);
////                continue;
////            }
////
////            System.out.print(cur.key + " ");
////            if (cur.left != null){
////                q.offer(cur.left);
////            }
////            if (cur.right != null){
////                q.offer(cur.right);
////            }
////        }
////
////    }
//
//    public static void LevelOrderTraversalLineByLine(TreeNode root){
//        int size = 0;
//        if(root == null){
//            System.out.println(size);
//            return;
//        }
//
//
//
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//
//        q.offer(root);
//
//        while (!q.isEmpty()){
//            int count = q.size();
//            size += count;
//            for (int i = 0; i < count; i++){
//                TreeNode cur = q.poll();
//                System.out.print(cur.key + " ");
//                if (cur.left != null){
//                    q.offer(cur.left);
//                }
//                if (cur.right != null){
//                    q.offer(cur.right);
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println("Size of tree is " + size);
//    }
//
//
//    public static int SizeOfTree(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        else {
//            return 1 + SizeOfTree(root.left) + SizeOfTree(root.right);
//        }
//    }
//
//    public static int MaximumInBinaryTree(TreeNode root){
//        if (root == null){
//            return Integer.MIN_VALUE;
//        }
//        else {
//            return Math.max(root.key,Math.max(MaximumInBinaryTree(root.left),MaximumInBinaryTree(root.right)));
//        }
//    }
//
//    public static void LeftViewOfBinaryTree(TreeNode root){
//        if (root == null){
//            return;
//        }
//
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//
//        q.offer(root);
//
//        while(!q.isEmpty()){
//            int count = q.size();
//            for (int i= 0; i < count; i++){
//                TreeNode cur = q.poll();
//                if (i == 0){
//                    System.out.print(cur.key+ " ");
//                }
//                if (cur.left != null){
//                    q.offer(cur.left);
//                }
//                if(cur.right != null){
//                    q.offer(cur.right);
//                }
//            }
//        }
//    }
//
//    public static Boolean ChildrenSumProperty(TreeNode root){
//        if (root == null){
//            return true;
//        }
//        if (root.left == null && root.right == null){
//            return true;
//        }
//
//        int sum = 0;
//        if(root.left != null){
//            sum += root.left.key;
//        }
//        if (root.right != null){
//            sum += root.right.key;
//        }
//
//        return (root.key == sum && ChildrenSumProperty(root.left) && ChildrenSumProperty(root.right));
//    }
//
//    public static boolean NaiveCheckBalancedTree(TreeNode root){
//        if (root == null){
//            return true;
//        }
//
//        int lh = TreeHeight(root.left);
//        int rh = TreeHeight(root.left);
//
//        return (Math.abs(lh-rh) <=1 && NaiveCheckBalancedTree(root.left) && NaiveCheckBalancedTree(root.right));
//
//    }
//
//    public static int CheckBalancedTree(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        int lh = CheckBalancedTree(root.left);
//        if (lh == -1){
//            return -1;
//        }
//        int rh = CheckBalancedTree(root.right);
//        if (rh == -1){
//            return -1;
//        }
//
//        if(Math.abs(lh-rh) > 1){
//            return -1;
//        }
//        else{
//            return Math.max(lh,rh) + 1;
//        }
//
//    }
//
//    public static int MaximumWidthOfTree(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//
//        q.offer(root);
//
//        int res = 0;
//
//        while (!q.isEmpty()){
//            int count = q.size();
//
//            res = Math.max(res,count);
//
//            for (int i = 0; i < count; i++){
//                TreeNode cur = q.poll();
//                if (cur.left != null){
//                    q.offer(cur.left);
//                }
//
//                if(cur.right != null){
//                    q.offer(cur.right);
//                }
//            }
//        }
//
//        return res;
//    }
//    public static void TreeTravelInSpiralForm(TreeNode root){
//        if(root == null){
//            return;
//        }
//
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//
//        q.offer(root);
//
//        while (!q.isEmpty()){
//            int count = q.size();
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        TreeNode bt = new TreeNode(20);
//        bt.left = new TreeNode(20);
//        bt.right = new TreeNode(30);
//        bt.left.left = new TreeNode(70);
//        bt.left.right = new TreeNode(45);
//        bt.right.left = new TreeNode(40);
//        bt.right.right = new TreeNode(50);
//
////        bt.left = new TreeNode(8);
////        bt.right = new TreeNode(12);
////        bt.right.left = new TreeNode(3);
////        bt.right.right = new TreeNode(9);
//
//
////        System.out.println("Inorder Traversal : ");
//        InorderTraversal(bt);
////        System.out.println("Preorder Traversal");
////        PreorderTraversal(bt);
////        System.out.println("Postorder Traversal");
////        PostorderTraversal(bt);
//
//
////        System.out.println(TreeHeight(bt));
//
////        NodeAtKDistance(bt, 3);
//
////        LevelOrderTraversal(bt);
//
////        LevelOrderTraversalLineByLine(bt);
//
////        System.out.println(SizeOfTree(bt));
//
////        System.out.println(MaximumInBinaryTree(bt));
////        LeftViewOfBinaryTree(bt);
//
////        System.out.println(ChildrenSumProperty(bt));
//
////        System.out.println(NaiveCheckBalancedTree(bt));
//
//        System.out.println(MaximumWidthOfTree(bt));
//    }
//}
