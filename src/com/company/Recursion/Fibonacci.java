package com.company;

import java.math.BigInteger;

// 0,1,1,2,3,5,8,13.....0th element is 0
public class Fibonacci {
    public static void main (String [] args){
//        int result = fibo(50);//-298632863 this is negative as the ans reaches the max limit of integer and overflows and
//        wraps around and provides the negative result
        long result1 = fibo1(50);
        System.out.println(result1);

    }

    static int fibo(int n){
//        base condition
        if(n==0||n==1){
            return n;
        }
//        Recurrence assumption
        int subProblem1 = fibo(n-1);
        int subProblem2 = fibo(n-2);

//        self work
        return subProblem1+subProblem2;

    }

    static long fibo1(int n){
        if(n==0||n==1){
            return n;
        }
        double phi = (1+Math.sqrt(5))/2;
//        long result = (long) Math.pow(phi,n);
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
//        when it was typecast to int then it was giving and not giving negative as power can not give negative ans
//        return result;
    }
}



// any program is not given the whole memory available but given a certain amount of space only
// How we would be able to print 50 th fibo number?
// Approach 1: use Dynamic Programming
// Approach 2: Using Binet's formula
