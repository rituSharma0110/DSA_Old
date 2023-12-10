package com.company.Precomputation;
import java.util.*;
// Given q queries find the number of frequency of each query in an array
// constraints --> q = 1e^5 , N = 1e^5 , Time limit - 1s

public class Precomputation {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[]{1,2,2,2,3,3,4,5,6,7,7};
        for (int i =0;i< array.length;i++){
            hshArray[array[i]]++; // O(N)
        }
        int q = scanner.nextInt();
//        while (q-->0){
//            int x = scanner.nextInt();
//            int ans = naiveFreq(array,x);
//            System.out.println(ans);// T.C --> 1e^10
//        }

//        above was a naive way having O(N^2) TC
        while (q-->0){
            int x = scanner.nextInt();
            System.out.println(hshArray[x]); // O (N) as accessing array is constant
        }

    }
    static int [] hshArray = new int[(int)1e8 + 10];
    static int naiveFreq(int [] array , int x){
        int cnt = 0;
        for (int i=0;i< array.length;i++){
            if (array[i]==x){
                cnt++;
            }
        }
        return cnt;
    }
}

