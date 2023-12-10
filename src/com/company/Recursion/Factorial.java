package com.company;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n =50;
//        BigInteger num = BigInteger.valueOf(n);
        int result = factorial(5);
        System.out.println(result);
    }

    static int factorial(int n){
        //Base Condition
        if(n==1){
            return 1;
        }
//        recurrence assumption
        int subProblem = factorial(n-1);
//         self work
        return n*subProblem;
    }

    static BigInteger factorial1(BigInteger n) {
        int num = 1;
        BigInteger bigNum = BigInteger.valueOf(1);
        if (n.equals(bigNum)) {
            return BigInteger.ONE;
        }

        return n.multiply(n.subtract(bigNum));

    }
}
