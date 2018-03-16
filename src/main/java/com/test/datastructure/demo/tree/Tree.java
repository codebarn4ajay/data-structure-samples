package com.test.datastructure.demo.tree;

public class Tree {
    private Node headNode;

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public void addLeafNode(int i) {
        headNode.setValue(i);
    }

//    private void addToRightNode(int i) {
//        headNode.addToRightNode(i);
//    }
//
//    private void addToLeftNode(int i) {
//        headNode.addToLeftNode(i);
//    }
}
