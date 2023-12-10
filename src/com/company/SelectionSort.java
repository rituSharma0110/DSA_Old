package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {5,1,3,4,2,-1,0};
        selectionSort(array);
        System.out.println(Arrays.toString(array));


    }

    static int minimumIndex(int [] array,int firstIndex ){
        int min = firstIndex;
        for (int i= firstIndex;i< array.length;i++){
            if (array[min]>array[i]){
                min = i;
            }
        }
        return min;
    }



    static void selectionSort(int [] array){
        boolean isSwapped = false;
        for (int i=0;i< array.length;i++){
            int min = minimumIndex(array,i);
            int temp = array[min];
            array[min]=array[i];
            array[i]=temp;
            isSwapped =true;

        }

    }
}
