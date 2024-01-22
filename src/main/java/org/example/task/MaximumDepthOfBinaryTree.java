package org.example.task;

import org.example.utils.TreeNode;

public class MaximumDepthOfBinaryTree {

    /*
    Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down
     to the farthest leaf node.
    */

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int counter){
        if(root != null){
            return Math.max(maxDepth(root.left, counter+1),maxDepth(root.right, counter+1));
        }

        return counter;
    }


    /*
    Input: root = [3,9,20,null,null,15,7]
    Output: 3
    */

    /*
    Input: root = [1,null,2]
    Output: 2
    */

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode treeNodeFirst = maximumDepthOfBinaryTree.firstEx();
        TreeNode treeNodeSecond = maximumDepthOfBinaryTree.secondEx();

        System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNodeFirst));
        System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNodeSecond));
    }


    private TreeNode firstEx() {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;

        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;

        return treeNode3;
    }


    private TreeNode secondEx() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.right = new TreeNode(2);

        return treeNode1;
    }
}
