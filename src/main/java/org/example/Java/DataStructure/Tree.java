package org.example.Java.DataStructure;

public class Tree {
// Binary Tree
    public static class BinaryTree {
        Node root;

        public static class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        public BinaryTree() {
            root = null;
        }

        public BinaryTree(int key) {
            root = new Node(key);
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            System.out.println(tree.root.key); //Output: 1
        }
    }
    //Binary Search Tree
    public static class BinarySearchTree {
        Node root;

        public static class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        public BinarySearchTree() {
            root = null;
        }

        public BinarySearchTree(int key) {
            root = new Node(key);
        }

        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            System.out.println(tree.root.key); //Output: 1
        }
    }
}
