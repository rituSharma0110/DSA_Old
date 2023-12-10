package com.company;

public class PrintingNumbers {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        if (n==11){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
