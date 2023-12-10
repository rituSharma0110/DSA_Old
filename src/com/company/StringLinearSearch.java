package com.company;

import java.util.Scanner;

public class StringLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = scanner.next().charAt(0);
        System.out.println(linearSearch(str,ch));
    }

    static boolean linearSearch(String str , char ch){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
