package com.company;

import java.util.Arrays;

public class PracticeOnSorting {
    public static void main(String[] args) {
        int [] array = {5,1,3,2,4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void sort(int [] array){
        boolean isSwapped = false;
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }

        }
    }

    static int minimum(int [] array, int firstIndex){
        int min = firstIndex;
        for (int i= firstIndex;i<array.length;i++){
            if (array[i]<array[min]){
                min =i;
            }
        }
        return min;
    }


    static void selectionSort(int [] array ){
        for (int i=0;i<array.length;i++){
            int min = minimum(array,i);
                int temp = array[min] ;
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }



