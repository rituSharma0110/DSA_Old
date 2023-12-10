package com.company;

import java.util.ArrayList;

public class LinearSearchMulOcc {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,4,4,5,6,6,7};
       // indexes(array,4,0);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(indexesOfElement(array,4,0,list));


    }
    static  ArrayList<Integer> list = new ArrayList<>();
    static void indexes(int [] array, int target, int index){
        if (index==array.length){
            return;
        }
        if (array[index]==target){
            list.add(index);
        }
            indexes(array,target,index+1);

    }
    static ArrayList<Integer> indexesOfElement(int [] array, int target, int index, ArrayList<Integer> list){
        if (index==array.length){
            return list;
        }
        if (array[index]==target){
            list.add(index);
        }
        return indexesOfElement(array,target,index+1,list);

    }
}
