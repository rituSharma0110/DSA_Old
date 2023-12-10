package com.company;

public class OrderAgnosticBSRev {
    public static void main(String[] args){
        int[] array = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int result = doBinarySearch(array,10);
        System.out.println(result);
    }

    static int doBinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        boolean isAsc = array[start]<array[end];

        if(isAsc){
            while (start<=end){
                int mid = start + (end-start)/2;

                if(array[mid]==target){
                    return mid;
                }else if(array[mid]>target){
                    end = mid-1;
                }else if(array[mid]<target){
                    start = mid + 1;
                }
            }

        }else {
            while (start<=end){
                int mid = start + (end-start)/2;

                if(array[mid]==target){
                    return mid;
                }else if(array[mid]>target){
                    start = mid + 1;
                }else if(array[mid]<target){
                    end = mid-1;
                }
            }
        }
        return -1;

    }
}
