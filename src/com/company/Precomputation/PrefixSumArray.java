package com.company.Precomputation;
import  java.util.*;
// Given an array of length N find out the sum of array elements from given index l to index r in form of q queries

public class PrefixSumArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] array = new int[n+1];
        for (int i =1;i<array.length;i++){// 1 based array as it won't affect the computation and l also starts from 1
            array[i] = scanner.nextInt();
//            prefixSum[i] = prefixSum[i-1]+array[i];
        }
        int q = scanner.nextInt();
        while (q-->0){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            long ans = naive(array,l,r);
            System.out.println(ans);
        }
//        while (q-->0){
//            int l = scanner.nextInt();
//            int r = scanner.nextInt();
//            System.out.println(prefixSum[r]-prefixSum[l-1]);
//        }
    }
    static int [] prefixSum = new int[(int) 1e5+10];

    static long naive( int [] array , int l , int r){
        long sum = 0;
        for (int i =l;i<=r;i++){
            sum+=array[i];
        }
        return sum;
    }
}
