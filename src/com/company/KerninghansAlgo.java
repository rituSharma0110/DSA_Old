package com.company;

public class KerninghansAlgo {
    public static void main(String[] args) {
        int x = 57;
        int cnt =0;

        while (x!=0){
            int rsbm = x&(-x);
            x = x -rsbm;
            cnt++;
        }
        System.out.println(cnt);
    }
}
