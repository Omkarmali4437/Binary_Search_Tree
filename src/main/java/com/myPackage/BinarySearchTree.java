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
}
