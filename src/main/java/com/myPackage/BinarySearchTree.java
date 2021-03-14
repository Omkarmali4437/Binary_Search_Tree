package com.myPackage;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public <T extends Comparable> void add(Node node){
        root = insert(this.root, node.data);
    }

    public <T extends Comparable> Node insert(Node root, T data){
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo(root.data) < 0){
            root.left = insert(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void getInOrder(){
        inOrder(root);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void getPreorder() {
        getPreorder(root);
    }

    public void getPreorder(Node root){
        if (root != null) {
            System.out.print(" " + root.data);
            getPreorder(root.left);
            getPreorder(root.right);
        }
    }

    public void getPostorder(){
        getPostorder(root);
    }

    public void getPostorder(Node root){
        if (root != null) {
            getPostorder(root.left);
            getPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }
    public int size() {
        return(size(root));
    }
    private int size(Node node) {
        if (node == null) return(0);
        else {
            return(size(node.left) + 1 + size(node.right));
        }
    }
}
