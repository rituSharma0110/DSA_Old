package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [][]array =   {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int[] result = search(array, 56);
        System.out.println(Arrays.toString(result));

    }

    static int [][] updateArray( int size){
        int [][] array = new int[size][size];
        for (int i=0; i< array.length;i++){
            for (int j=0;j<array[i].length;i++){
                array[i][j]= scanner.nextInt();
            }
        }
        return array;
    }

    static int[] search(int [][] array , int target ){
        if (array.length==0){
            return new int[]{-1,-1};
        }
        for (int i=0; i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
