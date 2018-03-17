package com.test.datastructure.demo.tree;

public class Node {
    private int value;
    private Node left;
    private Node right;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value==0){
            this.value = value;
        } else if(value<this.value && this.left!=null){
            this.left.setValue(value);
        } else if (value<this.value && this.left==null){
            this.left = new Node(value);
        }else if (value>this.value && this.right!=null){
            this.right.setValue(value);
        }else if (value>this.value && this.right==null){
            this.right = new Node(value);
        }

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

    public Node(int value) {
        this.value = value;
    }


}
