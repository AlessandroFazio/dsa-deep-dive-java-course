package org.example.trees.commons;

// This implementation does not handle the duplicate values,
// indeed they are forbidden. If you try to insert a value which is
// already present in the BinaryTree, it will return null
public class BinaryTree {
    private TreeNode root;

    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if(root != null) {
            return root.get(value);
        }
        return null;
    }

    public Integer min() {
        if(root != null) {
            return root.min();
        }
        return null;
    }

    public Integer max() {
        if(root != null) {
            return root.max();
        }
        return null;
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if(subTreeRoot == null) {
            return subTreeRoot;
        }
        if(value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(
                    delete(subTreeRoot.getLeftChild(), value)
            );
        }
        else if(value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(
                    delete(subTreeRoot.getRightChild(), value)
            );
        }
        else {
            // cases 0 and 1; node to delete has 0 or 1 children
            if(subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            }
            else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }
            // case 2; node to delete has 2 children
            // implementation choice: search min value in the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(
                    delete(subTreeRoot.getRightChild(), subTreeRoot.getData())
            );

        }
        return subTreeRoot;
    }

    public void delete(int value) {
        if(root == null) {
            System.out.println("Sorry the BinaryTree is empty, nothing to delete");
        }
        else if(root.get(value) == null) {
            System.out.println("Sorry, the value you want to delete does not exist in the BinaryTree");
        } else {
            root = delete(root, value);
        }
    }

    public void traverseInOrder() {
        if(root == null) {
            System.out.println("This BinaryTree is currently empty");
        }
        else {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if(root == null) {
            System.out.println("This BinaryTree is currently empty");
        }
        else {
            root.traversePreOrder();
        }
    }
}
