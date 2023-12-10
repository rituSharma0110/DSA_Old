package com.company;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int [] array = {3,5,7,7,7,7,8,8,9};
        int[] result = occurrence(array,7);
        System.out.println(Arrays.toString(result));
    }

    static int [] occurrence(int [] array, int target){
        int [] ans = {-1,-1};
       int startingIndex = search(array,target, true);
       int endIndex = search(array, target,false);

       ans[0]= startingIndex;
       ans[1]= endIndex;

       return ans;
    }

    static int search (int [] array, int target , boolean firstIndex){
        int start = 0;
        int end = array.length-1;
        int ans1=0;
        while (start<=end){
            int mid = start + (end - start)/2;

            if (array[mid]<target){
                start = mid +1;
            }else if (array[mid]>target){
                end = mid -1;
            }else if (array[mid]==target){
                ans1 = mid;
                if (firstIndex) {
                    end = mid-1;
                }else start = mid+1;

            }
        }
        return ans1;
    }
}
