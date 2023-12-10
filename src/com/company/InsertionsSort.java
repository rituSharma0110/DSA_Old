package com.company;

import java.util.Arrays;

public class InsertionsSort {
    public static void main(String[] args) {
        int [] array = {5,2,1,3,4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));


    }
   
    static void insertionSort(int [] array){
        for (int i=0;i< array.length-1;i++){
            for (int j= i+1;j>0;j--){
                if (array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]= temp;
                }else break;
            }
        }
    }
}
