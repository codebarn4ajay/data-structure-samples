package com.test.datastructure.demo.tree;

public class TreeSample {

    public static Tree createTree(){
        int arr[] = {10,40,78,59,80,16,24,19,55};
        Tree tree = new Tree();
        for(int i=0; i < arr.length; i++ ){
            if(i!=0){
                tree.addLeafNode(arr[i]);
            } else{
                tree.setHeadNode(new Node(arr[0]));
            }
        }
        return tree;
    }

    public static void main (String arg[]){
        Tree tree = createTree();
    }
}
