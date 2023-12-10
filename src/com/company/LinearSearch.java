package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//        int [] array = {22,45,35,67,47};
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }
        int element = scanner.nextInt();
        int result = linearSearch(array,element);
        System.out.println(result);
        System.out.println(linearSearch1(array, element));

    }

    static int linearSearch(int [] array , int element){
        if (array.length==0){
            return -1;
        }

        for (int i=0;i<array.length;i++){
            if (array[i] == element){
                return 1;
            }
        }

        return -1;
    }
    static boolean linearSearch1(int [] array , int element){
        if (array.length==0){
            return false;
        }

        for (int i=0;i<array.length;i++){
            if (array[i] == element){
                return true;
            }
        }

        return false;
    }

}
