package org.example.trees;

import org.example.trees.commons.BinaryTree;
import org.example.trees.commons.TreeNode;

import java.util.Optional;

public class BinaryTrees {
    public static void run() {
        BinaryTree tree = new BinaryTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInOrder();

        TreeNode node1 = tree.get(27);
        TreeNode node2 = tree.get(15);
        TreeNode node3 = tree.get(8);

        System.out.println();
        if(node1 != null) {
            System.out.println("Data = " + node1.getData());
        }
        if(node2 != null) {
            System.out.println("Data = " + node2.getData());
        }
        if(node3 != null) {
            System.out.println("Data = " + node3.getData());
        }

        int min = tree.min();

        System.out.println();
        System.out.println("Min of the BinaryTree = " + min);

        int max = tree.max();

        System.out.println();
        System.out.println("Max of the BinaryTree = " + max);

        // tree.delete(9999);
        // tree.delete(25);

        System.out.println();
        // tree.traverseInOrder();

        System.out.println("------ Challenge 1 ------");
        System.out.println("------ TraversePreOrder ------");
        System.out.println();
        tree.traversePreOrder();
    }
}
