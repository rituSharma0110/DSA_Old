package com.company;

public class EvenDigits {
    public static void main(String[] args) {
        int [] array = {12,345,89,1,90,-91,20,0};
        int result = countOfEven(array);
        System.out.println(result);

    }


    public static int countOfEven(int [] array){
        int count =0;
        for (int i=0;i<array.length;i++){
            if (isEven(array[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven (int number){
        int result = digits(number);
        if (result%2==0){
            return true;
        }else return false;

    }

    public static int digits(int number ){
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
