package com.wzc.javase.about.collection.binarytree;

public class MainTest {
    public static void main(String[] args) {
        Node node = new Node(6);
        node.addChildNode(10);
        node.addChildNode(11);
        node.addChildNode(12);
        node.addChildNode(9);
        while (true) {
            if (null == node) {
                break;
            }
            node.print();
            node = node.getRight();
        }
    }

}
