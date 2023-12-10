package com.company.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =2;i*i<=n;i++){
            while (n%i==0){
                list.add(i);
                n/=i;
            }
        }
        if (n>1){
            list.add(n);
        }
        System.out.println(list);
    }
}
