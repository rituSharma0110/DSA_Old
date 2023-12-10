package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 120345;
        int result = sumOfNumber(number);
        System.out.println(result);
        int result2 = sumUsingRec(number);
        int result3 = sumUsingRecursion(120345,0);
        System.out.println(result2);
        System.out.println(result3);

    }

    static int sumOfNumber(int number){
        int sum =0;
        while (number!=0){
            int n = number%10;
            sum= sum+n;
            number= number/10;
        }
        return sum;
    }

    static int sumUsingRec(int number){
        if (number==0){
            return 0;
        }
   //     int n = number%10;
     //   sum= sum+n;
        // int num= number/10;
       // return sumUsingRec(num,sum);--> this is wrong as there is no operation on parameters
        return number%10 + sumUsingRec(number/10);
    }

    static int sumUsingRecursion(int number, int sum){
        if (number==0){
            return 0;
        }
        int num = number%10;
        sum = sum+num;
        return num+ sumUsingRecursion(number/10,sum);

    }
}
