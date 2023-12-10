package com.company;

public class SearchInRotatedArray {
    public static void main(String[] args){
        int [] array = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int lowest = findMinInd(array);
        int first = doBinarySearch(array, 3, lowest, array.length-1);
        int second = doBinarySearch(array, 3, 0, lowest-1);
        if(first!=-1){
            System.out.println(first);
        }else if(second!=-1){
            System.out.println(second);
        }else System.out.println(-1);
//        int ans = doBinarySearch(array, 2);
//        System.out.println(ans);
    }

    // This function will find out how many times an array has been rotated
    static int findMinInd(int [] array){
        int ind = 0;
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid-1)%array.length;
            int next = (mid + 1)%array.length;
            if(array[mid]>=prev && array[mid]<=next){
                ind = mid;
            }else if(array[mid]>array.length){
                start = mid + 1;
            }else if(array[mid]<array.length){
                end = mid-1;
            }
        }

        return ind;

    }

    static int doBinarySearch(int[] array, int target, int start, int end){
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }


}
