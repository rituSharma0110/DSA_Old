package com.company;

public class SingleElementInSortedArr {
    public static void main(String[] args) {
        int [] array = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(doBinarySearch(array));

    }

    static int doBinarySearch(int[] array){
        int start = 0;
        int end = array.length-1;
        int mid = Integer.MIN_VALUE;
        while (start<=end){
            mid = (start+end)/2;
            if((mid%2==0 && array[mid]==array[mid+1]) ||(mid%2!=0 && array[mid-1]==array[mid])){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return mid;
    }
}
