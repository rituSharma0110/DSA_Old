package com.company;

public class PatternRev {
    public static void main(String[] args) {
        printPattern1(5,0);
        printPattern2(5,0);

    }

    static void printPattern1(int n, int i){
        if (n==0){
            return;
        }
        if (i<n){
            System.out.print("* ");
            printPattern1(n, i+1);
        }else {
            System.out.println();
            printPattern1(n-1,0);
        }
    }

    static void printPattern2(int n, int i){
        if(n==0){
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
