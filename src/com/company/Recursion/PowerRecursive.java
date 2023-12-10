package com.company;

import java.math.BigInteger;

public class PowerRecursive {
    public static void main(String[] args) {
        int result = powerRecursive(11,24);
        int ans = (int) Math.pow(11,24);//2147483647--> math.pow never returns negative value
        BigInteger variable1 = BigInteger.valueOf(11);
//        BigInteger variable2 = BigInteger.valueOf(24);
        int variable2 = 24;
        BigInteger ans1 = variable1.pow(variable2);// variable 2 must be int and not bigInteger
        System.out.println(ans1);
        System.out.println(ans);
        System.out.println(result);

        System.out.println(Integer.MAX_VALUE);
    }

    static int powerRecursive(int a, int b){
        if (b==1) return a;
        if (b==0) return 1;

        int subProblem = powerRecursive(a, b/2);
        if (b%2==0){
            return subProblem*subProblem;
        }
        else return a*subProblem*subProblem;
    }
}
// BigInteger has a range of -2^(INTEGER_MAX)  to 2^(INTEGER_MAX)
