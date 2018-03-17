package com.test.datastructure.demo.tree;

public class TreeUtilities {

    public void printTree(Node node){
        System.out.println(node.getValue());
        if(node.getLeft()!=null){
            printTree(node.getLeft());
        }
        if(node.getRight()!=null){
            printTree(node.getRight());
        }
    }
}
