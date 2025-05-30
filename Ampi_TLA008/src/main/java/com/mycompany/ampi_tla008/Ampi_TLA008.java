package com.mycompany.ampi_tla008;


public class Ampi_TLA008 {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        // Inserting Nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        // Printing the traversals
        System.out.println("InOrder traversal:");
        bst.inOrder(); // Output should be: 20 30 40 50 60 70 80
        System.out.println("\nPreOrder traversal:");
        bst.preOrder(); // Output should be: 50 30 20 40 70 60 80
        System.out.println("\nPostOrder traversal:");
        bst.postOrder(); // Output should be: 30 20 40 60 80 70 50
        
    }
}


    class BinarySearchTree {

    // Node class representing each node in the BST (Binary Search Tree)
    class Node {

        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of the BST
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new key in the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
            
        // Return the unchanged node pointer
        return root;
        }
    
    // InOrder traversal of the BST
    void inOrder() {
        inOrderRec(root);
        
    }
    
    // A utility function to do InOrder traversal of BST
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key + " ");
            inOrderRec(root.right);
        }
    }
    
    // PreOrder traversal of the BST
    void preOrder() {
        preOrderRec(root);
        
    }
    
    // A utility function to do PreOrder traversal of BST
    void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    // PostOrder traversal of the BST
    void postOrder() {
        postOrderRec(root);
        
    }
    
    // A utility function to do PostOrder traversal of BST
    void postOrderRec(Node root) {
        if (root != null) {
            preOrderRec(root.left);
            preOrderRec(root.right);
            System.out.println(root.key + " ");
        }
    }
    
}
