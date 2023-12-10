package com.company;

public class RecursionRevision {
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
        System.out.println();
        printRev(n);
        System.out.println();
        printNumPatter(n);

        int n1 = 12345;
        int ans = sumOfDig(n1);
        System.out.println(ans);

    }

    static void printNum(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
    static void printRev(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        printRev(n-1);
    }

    static void printNumPatter(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNumPatter(n-1);
        System.out.println(n);
    }

  static  int sumOfDig (int n){
        if (n==0){
            return 0;
        }

        return n%10 + sumOfDig(n/10);
  }



}
