package com.company;

import java.util.Scanner;

public class OccurrenceByArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int occ = scanner.nextInt();
        int count =0;
        int [] array = numToArray(number);
        for (int i =0;i<array.length;i++){
            if (array[i]==occ){
                count++;
            }
        }
        System.out.println(count);
    }

    static int[] numToArray(Integer number){
        String str = number.toString();
        int [] array = new int[str.length()];
        for (int i=0;i<str.length();i++){
            array[i] = str.charAt(i) - '0';
        }
        return array;
    }
}
