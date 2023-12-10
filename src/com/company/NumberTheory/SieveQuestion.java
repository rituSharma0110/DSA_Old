package com.company.NumberTheory;

import java.math.BigInteger;
import java.util.Scanner;

public class SieveQuestion {
    static  int n = (int) (1e6+1);
    static int [] cntArray = new int[n];
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] array = new int[size];

        int hsh [] = new int[n];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
            hsh[array[i]]++;
        }
        for (int i=1;i<size ;i++){
            for (int j =i;j<size;j+=i){
                cntArray[i]= hsh[j];
            }
        }
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        long lcm = (long )p*q/gcd(p,q);
        long ans = cntArray[p]+ cntArray[q];
        if (lcm<n){
            ans -= cntArray[(int) lcm];
        }
        System.out.println(ans);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

}
