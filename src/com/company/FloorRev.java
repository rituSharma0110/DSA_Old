package com.company;

public class FloorRev {
    public static void main(String[] args) {
        int [] array =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int result = binarySearch(array,23);
        System.out.println(result);
    }

    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                ans = array[mid];
                start = mid + 1;
            }else if(array[mid]>target){
                end = mid - 1;
            }
        }
        return ans;
    }
}
