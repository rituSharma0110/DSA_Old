package com.company;

import java.util.Arrays;

// bubble sort is also called sinking sort or exchange sort
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5,1,3,2,4,-1,0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubbleSort(int [] array){
        boolean swapped = false;
        for (int i=0;i< array.length;i++){
            for (int j =0;j< array.length-i-1;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] =temp;
                    swapped =true;
                }
            }
            if (!swapped){
                return;
            }
        }
    }
}
