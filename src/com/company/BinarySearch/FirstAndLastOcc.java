package com.company;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int [] array = {-9, -3, 1, 7, 9, 9, 9, 9, 10, 12};
        int[] ans = returnAns(array, 9);
        System.out.println(Arrays.toString(Arrays.stream(ans).toArray()));
    }

    static int doBinarySearch(int[] array, int target, boolean firstOcc){
        int ans = -1;
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(firstOcc){
                if(array[mid]==target){
                    ans = mid;
                    end = mid-1;
                }else if(array[mid]<target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if(array[mid]==target){
                    ans = mid;
                    start = mid+1;
                }else if(array[mid]<target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return ans;
    }

    static int[] returnAns(int[] array, int target){
        int firstOcc = doBinarySearch(array, target, true);
        int lastOcc = doBinarySearch(array, target, false);

        return new int[]{firstOcc, lastOcc};
    }

}
