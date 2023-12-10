package com.company;

import java.util.Scanner;

public class Occurrence {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            int occ = scanner.nextInt();
            int remainder =0;
            int count =0;
            while (number!=0){
                remainder = number%10;
                if (remainder==occ){
                    count++;
                }
                number = number/10;
            }
            System.out.println(count);
        }
    }
}

// Second way of doing the same question is to use array
