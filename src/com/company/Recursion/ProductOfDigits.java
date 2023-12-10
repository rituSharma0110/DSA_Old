package com.company;

public class ProductOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int result = productUsingRec(number, 1);
        System.out.println(result);

    }
    static int productUsingRec(int number, int product){
        if (number%10==number){
            return number;
        }

        int num = number%10;
        product = product*num;
        return num*productUsingRec(number/10,product);
    }
}
