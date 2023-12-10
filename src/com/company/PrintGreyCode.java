package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintGreyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<String> res = solution(num);
        System.out.println(res);

    }
    static ArrayList<String> solution(int number){
        if (number==1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        ArrayList<String> subProblem = solution(number-1);
        ArrayList<String > finalResult = new ArrayList<>();
        for (int i =0;i<subProblem.size();i++){
            String str = subProblem.get(i);
            finalResult.add("0" + str);
        }
        for (int i =subProblem.size()-1;i>=0;i--){
            String str = subProblem.get(i);
            finalResult.add("1" + str);
        }
        return finalResult;
    }

}
