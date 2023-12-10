package com.company;

public class Sorted {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,5,6,7};
        System.out.println(sorted(array,0));

    }

    static boolean sorted(int [] array, int index){
        if (index== array.length-1){
            return true;
        }

        return array[index]<=array[index+1] && sorted(array, index+1);
    }
}
