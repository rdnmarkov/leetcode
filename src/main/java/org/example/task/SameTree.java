package org.example.task;

import org.example.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class SameTree {
    private final ArrayList<Integer> integers = new ArrayList<>();


   /*

    Given the roots of two binary trees p and q, write a function to check if they are the same or not.

    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    */

    public boolean isSameTree(TreeNode p, TreeNode q) {

        ArrayList<Integer> pVal = new ArrayList<>();

        listVal(p);
        pVal.addAll(integers);
        integers.clear();
        listVal(q);
        return pVal.equals(integers);
    }

    private List<Integer> listVal(TreeNode n){
        if(n == null){
            integers.add(null);
            return null;
        }
        integers.add(n.val);
        listVal(n.left);
        listVal(n.right);

        return integers;
    }


    /*
    Input: p = [1,2,3], q = [1,2,3]
    Output: true

    Input: p = [1,2], q = [1,null,2]
    Output: false
    */

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode treeNode1 = sameTree.createTreeNode();
        TreeNode treeNode2 = sameTree.createTreeNode();
        TreeNode treeNode3 = sameTree.createTreeNode(6);

        System.out.println(sameTree.isSameTree(treeNode1, treeNode2));
        System.out.println(sameTree.isSameTree(treeNode1, treeNode3));

    }

    private TreeNode createTreeNode(int... nums) {
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(nums.length == 0 ? 7 : nums[0]);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode14 = new TreeNode(14);
        TreeNode treeNode10 = new TreeNode(10);

//root
        treeNode8.left = treeNode4;
        treeNode8.right = treeNode12;
//left
        treeNode4.left = treeNode2;
        treeNode4.right = treeNode5;

        treeNode2.right = treeNode3;
        treeNode5.right = treeNode7;
//right
        treeNode12.left = treeNode9;
        treeNode12.right = treeNode14;

        treeNode9.right = treeNode10;

        return treeNode8;
    }

}
