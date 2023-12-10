package com.company.NumberTheory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SieveOfErastothenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sieve(n);
        for (int i =1;i<=n;i++){
            if (set.contains(i)){
                System.out.println(i);

            }
        }

    }
    public static  Set<Integer> set = new HashSet<>();

    static void  sieve(int number){
        int [] array = new int[number+1];// n+1 as array is 0 indexed
        Arrays.fill(array, 1);
        array[0]=0;
        array[1]=0;

        for (int i =2;i<=number;i++){
            if (array[i]==1) {
                set.add(i);

                for (int j = 2 * i; j <= number; j += i) {
                    array[j] = 0;
                }
            }
        }

    }
}
