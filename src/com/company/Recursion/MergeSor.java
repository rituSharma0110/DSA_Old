package com.company;

import java.util.Arrays;

public class MergeSor {
    public static void main(String[] args) {
        int [] array ={ -7,-9,6,0,34,9,19};
        int [] sortedArray = sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    static int[] sort(int [] array ){
        if (array.length==1){
            return array;
        }
        int mid = array.length/2;
        int [] left = sort(Arrays.copyOfRange(array, 0, mid));
        int [] right = sort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);

    }
    static int [] merge(int []first , int [] second ){
        int [] mix = new int[first.length + second.length];

        int i =0;
        int j =0;
        int k =0;
        while (i< first.length && j< second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                k++;
            } else if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
                k++;
            }
        }

        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
