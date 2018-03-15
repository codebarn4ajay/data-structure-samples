package com.test.datastructure.demo.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> items = new ArrayList();

    public void add(int item){
        items.add(item);
    }

    public int get(){
        return items.size()>0 ? items.remove(0): 0;
    }

    public int getQueueSize() {
        return items.size();
    }
}
