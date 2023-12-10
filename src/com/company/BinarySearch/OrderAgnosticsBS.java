// Order agnostic binary search in which we only know that array is sorted. It is not known whether it is
//sorted in ascending or descending


package com.company;

public class OrderAgnosticsBS {

    public static void main(String[] args) {
        int[] array = {27, 23, 29, 8, 5, 3, 0, -3 - 7 - 18};
        int ans = doBinarySearch(array, 8);
        System.out.println(ans);
    }

    static int doBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isAsc = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    start = mid + 1;
                } else if (array[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    end = mid - 1;
                } else if (array[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    // Better code
    static int doOrderAgnosticBS(int [] array, int target){
        int start = 0;
        int end = array.length-1;

        boolean isAsc = array[end]>array[start];

        while (start<=end){
            int mid = (start+end)/2;

            if(array[mid]==target){
                return mid;
            }
            if(isAsc){
                if(array[mid]<target){
                    start = mid +1;
                }else end = mid-1;
            }else {
                if(array[mid]<target){
                    end = mid-1;
                }else start = mid +1;
            }
        }

        return -1;
    }
}
