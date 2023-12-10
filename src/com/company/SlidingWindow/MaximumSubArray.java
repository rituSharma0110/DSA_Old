package com.company.SlidingWindow;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] array ={4, 3, 9, 5, 1, 2};
        int size = 3;
        int ans = maxSum(array,3);
        System.out.println(ans);

    }

    static int maxSum (int [] array, int size) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < array.length) {
            sum = sum + array[j];
            if (j - i +1 < size) {
                j++;
            } else if (j - i + 1 == size) {
                max= Math.max(sum,max);
                sum = sum - array[i];
                i++;
                j++;

            }
        }
        return max;
    }
}
