package com.company;
// Given a number from 1 to N, find the missing number
public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {0,4,3,2};//0,4,2,3
        cyclicSort(array);
        int result = missingNumber1(array);
        System.out.println(result);


    }

    static void swap (int [] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static void cyclicSort(int [] array){
        int i =0;
        while (i<array.length){
            int correct = array[i];
            if (array[i]< array.length && array[i]!=array[correct]){
                swap(array, i, correct);
            }else i++;
        }
    }
    static int missingNumber1(int  [] array) {
        int number =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i){
                number = i;// returning the very first index as other indexes will also enter the if condition
            }
        }
        return number;
    }

    static int missingNumber2(int [] array){
        int num = array.length;//1,2,3,4,5,6// 0,1,2,3,4,5->two different cases
        int sumOfNumbers = num*(num+1)/2;
        int sum =0;
        int result =0;
        for (int i=0;i< array.length;i++){
            sum = sum + array[i];
        }

        result = sumOfNumbers - sum;

        return result ;
    }


}

// Another approach can be: find the sum of the numbers and then subtract the sum of array from it
// Approach 3rd can be using Bit manipulation (XOR operation) but can not be applied when numbers are from 0 as xor of number with 0 is 0