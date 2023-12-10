package com.company;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] array= {2, 5, 7, 9, 10, 12, 15, 16, 18, 20, 24, 28, 32, 35};
        int result = search(array, 16 );
        System.out.println(result);
    }

    static int search (int [] array, int target){
        int start =0;
        int end = array.length-1;
// basically what we want in any binary search algo is start and end and here we dont have the end position
// also target always lies in the mid of end and start so we will try to shift end to the index which is having target in between start and end
// once target is between start and end we can start binary search, the next code block can be used to make target in btw start and end
        while (target>array[end]){
            start= end+1;
            end = end*2;
        }


        while (start<=end){
            int mid = (end +start)/2;

            if (array[mid]>target){
                end = mid -1;
            }else if (array[mid]<target){
                start = mid +1;
            }else return mid;
        }

        return -1;
    }
}
