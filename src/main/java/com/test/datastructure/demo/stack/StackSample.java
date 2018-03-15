package com.test.datastructure.demo.stack;


public class StackSample {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60};
        Stack stack = new Stack();
        insertItems(arr, stack);
        fetchItems( arr,  stack);
    }

    private static void insertItems(int[] arr, Stack stack) {
        for(int i=0; i<arr.length;i++){
            stack.push(arr[i]);
            System.out.println("Item that is pushed "+arr[i]+ " and size of stack is" +stack.getStackSize());
        }
    }

    private static void fetchItems(int[] arr, Stack stack) {
        for(int i=0; i<arr.length;i++){
            System.out.println("Item that is pulled "+stack.pop()  +" Size of stack is"+stack.getStackSize());
        }
    }
}
