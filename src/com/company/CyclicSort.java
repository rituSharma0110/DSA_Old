package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] array = {5,1,2,4,3};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void swap(int [] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static void cyclicSort(int [] array){
        int i=0;
        while (i< array.length){
            int correct = array[i]-1;
            if (array[i]!=array[correct]){
                swap(array,i,correct);
            }else i++;
        }
    }
}
