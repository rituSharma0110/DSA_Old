package com.company;

import java.util.Scanner;

public class JosephusAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-->0){
            int num = scanner.nextInt();
            int ans = josAlgo(num);
            System.out.println(ans);
        }

    }
    static int josAlgo(int number ){
        int ans = 1; //--> ans can not be zero as we are starting from 1 itself.
        while (ans*2<=number){
            ans *=2;
        }
        int h = number-ans;
        int val = 2*h +1;
        return val;
    }

}
