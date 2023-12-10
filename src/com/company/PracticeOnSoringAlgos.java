package com.company;

import java.util.Arrays;

public class PracticeOnSoringAlgos {
    public static void main(String[] args) {
        int [] array = {5,1,2,4,3};
        cyclicSorting(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSorting(int [] array){
        int i=0;
        while (i<array.length){
            int correct = array[i]-1;
            if (array[i]!= array[correct]){
                int temp = array[correct];
                array[correct] = array[i];
                array[i] = temp;
            }else i++;
        }

    }


}
