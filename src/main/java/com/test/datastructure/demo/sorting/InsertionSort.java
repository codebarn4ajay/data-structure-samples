package com.test.datastructure.demo.sorting;

public class InsertionSort {
    public static void insertionSort(int[] alist){
        int position = 0;
        int currentValue = 0;
        for(int index=0; index<alist.length;index++){
            currentValue = alist[index];
            position =index;

            while(position>0 && alist[position-1]>currentValue){
                alist[position]=alist[position-1];
                position =position-1;
            }
            alist[position]=currentValue;
        }
        for(int i=0;i<alist.length;i++){
            System.out.println(alist[i]);
        }

    }

    public  static void  main (String args[]){
      int[]  alist ={54,26,93,17,77,31,44,55,20};
        insertionSort(alist);
    }
}
