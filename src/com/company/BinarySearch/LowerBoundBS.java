package com.company;
import java.util.*;

public class LowerBoundBS {
    public static void main(String[] args){
        int [] array = {-9, -3, 1, 7, 9, 9, 9, 9, 10, 12};
        int ans = doBinarySearch(array, 9);
        System.out.println(ans);
    }

    static int doBinarySearch(int [] array, int target){
       int ans = -1;
       int start = 0;
       int end = array.length-1;
       while (start<=end){
           int mid = start + (end - start)/2;

           if(array[mid]==target){
               ans = mid;
               end = mid -1;
           }else if(array[mid]>target){
               end = mid-1;
           }else  if(array[mid]<target){
               start = mid + 1;
           }

       }


       return ans;
    }

    // Better code
    static int lowerBoundBs(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int ans = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(array[mid]==target){
                ans = mid;
                end = mid-1;
            }else if(array[mid]<target){
                start = mid+1;
            }else end = mid-1;
        }

        return ans;
    }
}
