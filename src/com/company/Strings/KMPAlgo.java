package com.company.Strings;

import java.util.Scanner;

public class KMPAlgo {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "abbcabc";
        String pattern = "abc";
        char [] strArray = str.toCharArray();
        char [] ptrArray = pattern.toCharArray();
        boolean y = false;
        int s = str.length();
        int p = pattern.length();
        for (int i =0;i<=s-p;i++){
            for (int j =0;j<p;j++){
                if (strArray[i+j]==ptrArray[j]){
                    y = true;
                }else {
                    y = false;
                }
            }
        }
        if (y ){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
