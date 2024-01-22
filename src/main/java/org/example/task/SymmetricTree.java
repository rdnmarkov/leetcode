package org.example.task;

import org.example.utils.TreeNode;

import java.util.ArrayList;

public class SymmetricTree {

    /*

    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    */

    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        return isSymmetricLeftAndRight(root.left, root.right);
    }

    public boolean isSymmetricLeftAndRight(TreeNode p, TreeNode q){

        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;

        return isSymmetricLeftAndRight(p.left, q.right) && isSymmetricLeftAndRight(p.right, q.left);
    }




    /*
          1
       2  |  2
     3  4 | 4  3

    Input: root = [1,2,2,3,4,4,3]
    Output: true

             1
        2    |    2
    null  3  | null  3

    Input: root = [1,2,2,null,3,null,3]
    Output: false

    */

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode treeNode1 = symmetricTree.firstEx();
        TreeNode treeNode2 = symmetricTree.secondEx();

        System.out.println(symmetricTree.isSymmetric(treeNode1));
        System.out.println(symmetricTree.isSymmetric(treeNode2));
    }

    private TreeNode firstEx(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode33 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode44 = new TreeNode(4);

        treeNode1.left = treeNode22;
        treeNode22.left = treeNode33;
        treeNode22.right = treeNode44;

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode3;

        return treeNode1;
    }
    private TreeNode secondEx(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode33 = new TreeNode(3);

        treeNode1.left = treeNode22;
        treeNode22.right = treeNode33;

        treeNode1.right = treeNode2;
        treeNode2.right = treeNode3;

        return treeNode1;
    }
}
