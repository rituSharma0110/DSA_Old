package com.company;

public class Pattern {
    public static void main(String[] args) {
        printPattern(5,0);
        printPattern2(5,0);

    }
    static void printPattern(int n, int i){
        if (n==0){
            return;
        }
        if (i<n){
            System.out.print("* ");
            printPattern(n,i+1);
        }else {
            System.out.println();
            printPattern(n - 1, 0);
        }
    }

    static void printPattern2(int n , int i){
        if (n==0){
            return;
        }

        if (i<n){
            printPattern2(n,i+1);
            System.out.print("* ");
        }else {
            printPattern2(n-1,0);
            System.out.println();
        }
    }
}
