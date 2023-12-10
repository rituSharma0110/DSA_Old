package com.company.BitManipulation;

public class Basics {
    public static void main(String[] args) {
        int number = 5;
        int sBit = setBit(number);
        System.out.println(sBit);//-->7
        System.out.println(Integer.toBinaryString(sBit));//-->111
        int uBit = unsetBit(number);
        System.out.println(uBit);//--> 4
        System.out.println(Integer.toBinaryString(uBit));//-->100
        int tBit = toggleBit(number);
        System.out.println(tBit);//-->1
        System.out.println(Integer.toBinaryString(tBit));//-->1
    }
    static int setBit(int number){
        int res = 0;
        int mask = 1<<1;
        res = mask | number;
        return res;
    }
    static int unsetBit(int number){
        int res =0;
        int mask = ~1;

        res = number&mask;
        return res;
    }
    static int toggleBit(int number ){
        int res =0;
        int mask = 1<<2;
        res = mask ^ number;
        return res;
    }

}
