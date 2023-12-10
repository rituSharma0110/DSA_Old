package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        int target = 8;
        int result = indexOfTarget(array,target,0);
        System.out.println(result);

    }

    static int indexOfTarget(int [] array, int target , int index){
        if (index==array.length){
            return -1;
        }

        if (array[index]== target){
            return index;
        }

        return indexOfTarget(array,target,index+1);

    }
}
