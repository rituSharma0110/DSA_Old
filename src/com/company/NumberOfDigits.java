package com.company;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = -9038943;
        int result = digits(number);
        System.out.println(result);
    }

   public static int digits(int number){
        if (number==0){
            return 1;
        }
        int count =0;
        while (number!=0){  // if using number>0   if (num < 0) { // num = num * -1;
            //
            count++;
            number = number/10;
        }
        return count;
    }
}
