// In this question we have to find the greatest element which is less than or equal to the target

package com.company;
import java.util.*;

public class Ceil {
    public static void main(String[] args){
        int[] array = {-18, -7, -3, 0, 1, 2, 5, 8, 19, 23, 27};
        int ans = doBinarySearch(array, 3);
        System.out.println(ans);
    }

    static int doBinarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while (start<=end){

           mid = start + (end-start)/2;

            if(array[mid] == target){
                return mid;
            }else if(array[mid]<target){
                start = mid+1;
            }else if(array[mid]>target){
                end = mid-1;
            }
        }
        return end;

    }
}
