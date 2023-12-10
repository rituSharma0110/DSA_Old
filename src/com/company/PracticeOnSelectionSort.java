package com.company;

import java.util.Arrays;

public class PracticeOnSelectionSort {
    public static void main(String[] args) {
        int [] array = {5,2,1,3,5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    static int minIndex(int [] array, int firstIndex){
        int min = firstIndex;
        for (int i=firstIndex;i<array.length;i++){
            if (array[i]<array[min]){
                min = i;
            }
        }
        return min;
    }
    static void selectionSort(int [] array){
        for (int i=0;i< array.length;i++){
            int min = minIndex(array, i );
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
