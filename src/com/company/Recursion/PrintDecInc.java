package com.company;

public class PrintDecInc {
    public static void main(String [] args){
        printIncDec(5);
    }

    static void printIncDec(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
}
