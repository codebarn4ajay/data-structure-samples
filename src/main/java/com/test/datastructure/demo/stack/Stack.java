package com.test.datastructure.demo.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> items = new ArrayList();
    public void push (int element){
        items.add(element);
    }
    public int pop(){
        return items.size()>0? items.remove(items.size()-1):0;
    }

    public int getStackSize(){
        return items.size();
    }
}
