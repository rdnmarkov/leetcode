package org.example.task;

import org.example.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

   /*

    Given the root of a binary tree, return the inorder traversal of its nodes' values.

    */

    List<Integer> integers = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root != null) {
            if (root.left != null) inorderTraversal(root.left);
            integers.add(root.val);
            if (root.right != null) inorderTraversal(root.right);
        }

        return integers;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> treeNodes = new Stack<>();
            treeNodes.push(root);
            while (!treeNodes.isEmpty()) {
                TreeNode treeNode = treeNodes.peek();
                if (treeNode.left != null) {
                    treeNodes.push(treeNode.left);
                    treeNode.left = null;
                } else {
                    integers.add(treeNode.val);
                    treeNodes.pop();
                    if (treeNode.right != null) {
                        treeNodes.push(treeNode.right);
                        treeNode.right = null;
                    }
                }

            }
        }

        return integers;
    }

    /*

    (INORDER) Центрированный обход (ЛКП)

    Пересечь левое поддерево, т. е. вызвать inorderTraversal(left->subtree)
    Посетите корень.==    Пересечь правое поддерево, т.е. вызвать inorderTraversal(right->subtree)
    */

    public static void main(String[] args) {
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(7);
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


        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        binaryTreeInorderTraversal.inorderTraversal1(treeNode8).stream().forEach(el -> System.out.print(el + " "));


    }

}
