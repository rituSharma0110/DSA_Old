package com.company;

public class Allocation {
    public static void main(String[] args) {
        int [] array = {10,20,30,40};
        int students = 2;
        int result = bsForAllocation(array, students);
        System.out.println(result);

    }

    static int bsForAllocation(int [] array, int numberOfStudents){
        int start = max(array);
        int end = sumOfArray(array);
        int result =-1;

        while (start<=end){
            int mid = start + (end -start)/2;

            if (isValid(array,mid,numberOfStudents)){
                result = mid;
                end = mid-1;
            }else start = mid +1;

        }

        return result;
    }

    static boolean isValid(int [] array, int max , int k ){
        int students =1;
        int sum =0;
        for (int i=0;i<array.length;i++) {
            sum = sum + array[i];
            if (sum > max) {
                students++;
                sum = array[i];
            }
        }

        return students <= k;

    }

    static int max(int [] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    static int sumOfArray(int [] array) {
        int sum =0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

//    same question https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=14390
}
