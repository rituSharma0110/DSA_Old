package com.company;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();
        pattern(n,0);
        System.out.println();
        patternInverted(n,0);

    }

    static void pattern(int r, int c){
        if (r==0){
            return;
        }

        if (c<r){
            System.out.print("*");
            pattern(r,c+1);
        }else {
            System.out.println();
            pattern(r-1,0);
        }
    }
    static void patternInverted(int r, int c){
        if (r==0){
            return;
        }

        if (c<r){
            patternInverted(r,c+1);
            System.out.print("*");
        }else {
            patternInverted(r-1,0);
            System.out.println();

        }
    }

}
