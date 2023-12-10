package com.company;

import java.util.Arrays;

public class AllocateBookPages {
    public static void main(String[] args) {
        int [] books = {12,34,67,90};
        int students = 2;
        int result = bsForMax(books,students);
        System.out.println(result);
    }
    static int maxOfArray(int []  array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int sumOfAll(int [] array){
        int sum =0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum;
    }
    static int bsForMax(int [] array, int k){
        int start = maxOfArray(array);
        int end = sumOfAll(array);
        int result =-1;

        while (start<=end){
            int mid = start+ (end - start)/2;

            if(isValid(mid,k,array )){
                result = mid;
                end = mid-1;
            }else start = mid+1;
        }
        return result;
    }

    static boolean isValid(int max, int k, int [] array ){
        int student =1;
        int sum =0;

        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
            if (sum>max){
                student++;
                sum=array[i];
            }
        }

        if (student>k){
            return false;
        }return true;

    }
}
