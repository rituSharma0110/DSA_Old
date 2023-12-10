package com.company.NumberTheory;

import java.math.BigInteger;

public class FactorialUsingBigInt {
    public static void main(String[] args) {
        BigInteger fact = BigInteger.ONE;
        for (int i =2;i<=25;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
