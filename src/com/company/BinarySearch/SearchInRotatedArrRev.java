package com.company;

public class SearchInRotatedArrRev {
    public static void main(String[] args) {
        int [] array = {7, 8, 9,1, 2, 3, 4, 5, 6};
        int index = findMin(array);
        int first = doBinarySearch(array, 3, 0, index-1);
        int second = doBinarySearch(array, 3, index, array.length-1);
        if(first!=-1){
            System.out.println(first);
        }else if(second!=-1){
            System.out.println(second);
        }
    }

    static int findMin(int [] array){
        int start = 0;
        int end = array.length-1;
        int ind = 0;

        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid-1 + array.length)%array.length;
            int next = (mid+1)%array.length;
            if(array[mid]<=array[prev] && array[mid]<=array[next]){
                ind = mid;
                return ind;
            }else if(array[mid]<=array[end]){
                end = mid-1;
            }else if(array[mid]>=array[start]){
                start = mid+1;
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
