package com.company;

public class BSUsingRecursion {
    public static void main(String [] args){
        int [] array = {3,7,90,113,890,1000,1004};
        int result = binarySearch(array,890,0,array.length-1);
        System.out.println(result);

    }

    static int binarySearch(int [] array, int target, int start, int end){
        if (start>end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if (array[mid]>target){
            return binarySearch(array,target , start, mid-1);
        }else if(array[mid]<target){
            return binarySearch(array, target, mid + 1, end);
        }else return mid;
    }
}
