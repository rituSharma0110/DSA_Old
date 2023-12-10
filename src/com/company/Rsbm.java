package com.company;

public class Rsbm {
    public static void main(String[] args) {
        int x = 72;
        int ans = x&(-x);
        System.out.println(ans);//-->8
        System.out.println(Integer.toBinaryString(ans));// -->1000
    }
}
