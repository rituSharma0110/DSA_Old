package com.company.NumberTheory;

import java.util.Scanner;
// Sum of all factors of a number. WE treat factors and divisor as same
public class DivisorOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        for (int i =1;i*i<=n;i++){
            if (n%i==0){
                sum+=i;
                System.out.print(i+" ");
                if (n/i!=i) {
                    sum += n / i; //--> for perfect square
                    System.out.println(n/i);
                }
            }
        }
        System.out.println(sum);
    }
}
