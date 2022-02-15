package com.wzc.javase.about.collection.binarytree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void addChildNode(int m) {
        if (m<this.data) {
            if (null == this.left) {
                this.left = new Node(m);
            }else {
                this.left.addChildNode(m);
            }
        }else {
            if (null == this.right) {
                this.right = new Node(m);
            }else {
                this.right.addChildNode(m);
            }
        }
    }
    public void print() {
        System.out.println();
    }

}
