package com.company;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();;
        int [] array = new int[size];
        for (int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }

        int result = minOfArray(array);
        System.out.println(result);

    }

    static int minOfArray (int [] array){
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
