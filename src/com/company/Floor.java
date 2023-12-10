package com.company;

public class Floor {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int result = floor(array,14);
        System.out.println(result);
    }

    static int floor(int [] array , int target){
        int end = array.length-1;
        int start = 0;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (array[mid]<target){
                start = mid+1;
            }else if (array[mid]>target){
                end = mid-1;
            }else  return array[mid];
        }
        return array[end];
    }
}
