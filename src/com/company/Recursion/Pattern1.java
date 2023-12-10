package com.company;

public class Pattern1 {
    public static void main(String[] args) {
        triangle(0,4);
        triangle2(0,4);

    }
    static void triangle(int columns, int rows){
        if (rows==0){
            return;
        }
        if (columns<rows){
            System.out.print("* ");
            triangle(columns+1,rows);
        }else {
            System.out.println();
            triangle(0,rows-1);
        }
    }

    static void triangle2(int columns, int rows){
        if (rows==0){
            return;
        }
        if (columns<rows){
            triangle2(columns+1,rows);
            System.out.print("* ");
        }else {
            triangle2(0,rows-1);
            System.out.println();
        }
    }

}
