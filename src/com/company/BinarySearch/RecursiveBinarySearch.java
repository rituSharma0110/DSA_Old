package com.company;

public class RecursiveBinarySearch {

    public static void main(String[] args){
        int[] array = {-18, -7, -3, 0, 2, 5, 8, 19, 23, 27};
        int ans = doBinarySearch(array, 0, array.length-1, 8);
        System.out.println(ans);
    }

    static int doBinarySearch(int[] array, int start, int end, int target){
        int mid = start + (end-start)/2;
        if(start>end) {
            return -1;
        }
        if(array[mid]==target){
            return mid;
        }else if(array[mid]<target){
            return doBinarySearch(array, mid+1, end, target);
        }
           return doBinarySearch(array, start, mid-1, target);



    }
}
