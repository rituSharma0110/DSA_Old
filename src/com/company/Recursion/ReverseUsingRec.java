package com.company;

public class ReverseUsingRec{
    public static void main(String[] args) {
        int number = 12345;
        int result = reverse(number);
        System.out.println(result);
        reverse1(1234);
        System.out.println(sum);
    }
    static int reverse(int number){
        if (number%10==number){
            return number;
        }

        return number%10*10 + reverse(number/10); //--> wrong as 50 + f(1234)--> 50+40 + f(123) --> 50+40+30 +f(12) --> 120 + 20 + f(1)-->141
    }


    static int sum =0;
    static void reverse1(int number){
        if (number==0){
            return;
        }
        int remainder = number%10;
        sum = sum*10 + remainder;
        reverse1(number/10);
    }
//    In recursion, when inside the function nothing changes, it returns void.

}
