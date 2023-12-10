package com.company;

import java.util.Arrays;

public class Practice2Jan {
    public static void main(String[] args) {
//        int [] array = {5,1,3,2,4};
//        bubbleSort(array);
//        System.out.println(Arrays.toString(array));
//        selectionSort(array);
//        insertionSort(array);
//        cyclicSort(array);
        int [] array = {0,4,3,2};
        int result = missingNumber(array);
        System.out.println(result);
        System.out.println(Arrays.toString(array));



    }

    static void bubbleSort(int [] array ){
        boolean isSwapped = false;
        for (int i =0;i< array.length;i++){
            for (int j =0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
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
    static int min(int [] array , int firstIndex){
        int minimum = firstIndex;
        for (int i=firstIndex;i< array.length;i++){
            if (array[i]<array[minimum]){
                minimum = i;
            }
        }
        return minimum;
    }
    static void selectionSort(int [] array){
        for (int i =0;i< array.length;i++){
            int minimum = min(array,i);
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }

    static void insertionSort(int [] array){
        for (int i=0; i< array.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else break;
            }
        }
    }

    static void cyclicSort(int [] array){
        int i=0;
        while (i< array.length){
            int correct = array[i]-1;
            if (array[i]!= array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] =temp;
            }else {
                i++;
            }
        }
    }

    static  int missingNumber(int [] array){
        int i =0;
        while (i< array.length){
            int correctIndex = array[i];
            if (array[i]< array.length && array[i]!= array[correctIndex]){
                int temp = array[i];
                array[i] = array[correctIndex];
                array[correctIndex] = temp;
            }else {
                i++;
            }
        }

        for (int j =0;j< array.length;j++){
            if (array[j] != j){
                return j;
            }
        }

        return array.length;
    }


}
