package com.company;
// if question has sorted array , apply binary search
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int result = binarySearch(array,10);
        System.out.println(result);
    }

    static int binarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;

        boolean isIncreasing = array[start] < array[end];

        if (isIncreasing){

            while (start<=end){
                int mid = start + (end - start)/2;

                if (array[mid]<target){
                    start = mid+1;
                }else if (array[mid]>target){
                    end = mid-1;
                }else return mid;
            }

        }else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (array[mid] < target) {
                    end = mid - 1;
                } else if (array[mid] > target) {
                    start = mid + 1;
                } else return mid;
            }
        }
        return -1;
    }
}
