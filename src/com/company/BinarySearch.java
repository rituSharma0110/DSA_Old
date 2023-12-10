package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int result = binarySearch(array,90);
        System.out.println(result);
    }

    static int binarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

           if (array[mid]<target){// 2,3,5,6,7,8,9,10
               start = mid +1;
           }else if (array[mid]>target){
               end = mid-1;
           }else
            {
               return mid;
            }
        }
        return -1;
    }
}
