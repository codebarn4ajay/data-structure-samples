package com.test.datastructure.demo.queue;

public class QueueSample {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        Queue queue = new Queue();
        insertItems(arr, queue);
        fetchItems(arr, queue);
    }

    private static void insertItems(int[] arr, Queue queue) {
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            System.out.println("Item that is pushed " + arr[i] + " and size of stack is" + queue.getQueueSize());
        }
    }

    private static void fetchItems(int[] arr, Queue queue) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Item that is fetched " + queue.get() + " Size of stack is" + queue.getQueueSize());
        }
    }
}
