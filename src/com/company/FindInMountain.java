package com.company;

public class FindInMountain {
    public static void main(String[] args) {
        int [] array = {1,9,21,24,69,100,99,79,19};
        int result  = search(array, 79);
        System.out.println(result);

    }



    static int search(int [] array, int target){
        int start =0;
        int end = array.length-1;
        int ans =0;

        while (start<end) {
            int mid = (end + start) / 2;

            if (array[mid] < array[mid + 1]) {
                start = mid + 1;
            } else end = mid;
        }
        ans = end;

        int res1 = binarySearch(array,target,0,ans);
        int res2 = binarySearch(array,target,end+1 , array.length-1);

        if (res1!=-1){
            return res1;
        }else return res2;

    }

    static int binarySearch(int [] array, int target, int start , int end){
//        int start =0;
//        int end = array.length-1;

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
