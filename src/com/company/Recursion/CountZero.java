package com.company;

public class CountZero {
    public static void main(String[] args) {
        int number = 30204;
        int result = helper(number);
        System.out.println(result);

    }
    static int helper(int number){
        return countOfZero(number,0);
    }

    static int countOfZero (int number, int count){
        if (number==0){
            return count;
        }

        int remainder = number%10;
        if (remainder==0){
            return countOfZero(number/10, count+1);

        }
        return countOfZero(number/10,count);

    }
}
