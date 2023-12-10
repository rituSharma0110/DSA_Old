package com.company;

public class Reverse2 {
    public static void main(String[] args) {
        int number = 12345;
        int result = reverse(number);
        System.out.println(result);

    }

    static int reverse(int number){
        int digits = (int ) Math.log10(number) + 1;
        return helper(number,digits);

    }

    static int helper(int number, int digits){
        if (number%10==number){
            return number;
        }
        int remainder = number%10;
        return (int)(remainder*Math.pow(10,digits-1) + helper(number/10, digits-1));
    }
}
