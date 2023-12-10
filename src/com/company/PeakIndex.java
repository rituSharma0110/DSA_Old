package com.company;


public class PeakIndex {
    public static void main(String[] args) {
        int [] array = {1,9,21,24,69,100,99,79,19};
        long currentTime = System.nanoTime();
//        int result = index(array);
        int result = index1(array);
        System.out.println(result);
        long endTime = System.nanoTime();
        long ans = endTime-currentTime;
        System.out.println(ans);//417886 //for small values index() would give less time as for small values n< logn

    }
    static int index(int [] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int index1(int [] array){
       int start =0;
       int end = array.length-1;

       while (start<end){
           int mid = (start+end)/2;
           if (array[mid]<array[mid+1]){// 2,3,4,5,8,s9me,7e,5,4e   s,m,e
               start = mid+1;
           }else end = mid;
       }
       return end;
    }
}
