package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SortUsingRecursion {
    public static void main(String[] args) {
        Integer[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i< array.length;i++){
            list.add(array[i]);
        }

        sort(list);
        System.out.println(list);

    }
    static void sort(ArrayList<Integer> list){
        if (list.size()==1){
            return ;
        }
//        int lastElement = list.get(list.size()-1);
        int lastElement = list.remove(list.size()-1);
        sort(list);
        insert(list,lastElement);

    }
    static void insert(ArrayList<Integer> list , int temp){
        if (list.size()==0 || temp>= list.get(list.size()-1)){
            list.add(temp);
            return;
        }
//        int val = list.get(list.size()-1);
        int val =list.remove(list.size()-1);
        insert(list,temp);
        list.add( val);

    }

}
