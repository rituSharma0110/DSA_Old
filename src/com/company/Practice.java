package com.company;

public class Practice {
    public static void main(String[] args) {
        int [] array = { 2,8,29,30,33,49,65};
//        int [] array = {65,49,33,30,29,8,2};
//        int result = binarySearchOA(array,49);
//        int result = ceiling(array,31);
//        int result = floor(array,31);
        int result = bsInInfiniteArray(array,30);
        System.out.println(result);

    }

    static int binarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (array[mid]<target){
                start = mid+1;
            }else if (array[mid]>target){
                end = mid-1;
            }else return mid;
        }
        return -1;
    }

    static int binarySearchOA(int [] array, int target){
        int start =0;
        int end = array.length-1;

        boolean isIncreasing = array[start]<array[end];

        while (start<=end){
            int mid = start + (end - start)/2;

            if (isIncreasing) {
                if (array[mid] > target) {
                    end = mid - 1;
                } else if (array[mid] < target) {
                    start = mid + 1;
                } else return mid;
            }else {
                if (array[mid]>target){
                    start= mid+1;
                }else if (array[mid]<target){
                    end = mid-1;
                }else return mid;
            }
        }
        return -1;
    }

    static int ceiling (int [] array,int target){
        int end = array.length-1;
        int start =0;

        while (start<=end){
            int mid = start +(end-start)/2;

            if (array[mid]>target){
                end = mid -1;
            }else if (array[mid]<target){
                start = mid +1;
            }else return array[mid];
        }
        return array[start];
    }

    static int floor(int [] array,int target){
        int end = array.length-1;
        int start =0;

        while (start<=end){
            int mid = start +(end-start)/2;

            if (array[mid]>target){
                end = mid -1;
            }else if (array[mid]<target){
                start = mid +1;
            }else return array[mid];
        }
        return array[end];
    }

    static int bsInInfiniteArray(int [] array, int target){
        int start =0;
        int end = 1;

        while (start<=end){
            int mid = (start + end)/2;

            if (array[mid]<target){
                start = mid+1;
            }else if (array[mid]>target){
                end = mid -1;
            }else return mid;

            start= end+1;
            end = start + (end-start+1)*2;


        }
        return -1;
    }
}
