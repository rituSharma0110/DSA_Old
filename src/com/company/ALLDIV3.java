package com.company;

public class ALLDIV3 {
    public static void main(String[] args) {
        int [] array = {4,5,6,3,8,1};
        int result = steps(array);
        System.out.println(result);

    }
    static int steps(int [] array){
        int count =0;
        for (int i=0;i< array.length;i++){
            if (array[i]%3 == 0){
                count=0;
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]%3==1 && array[j]%3 == 2){
                    array[i]=array[i]-1;
                    array[j]=array[j]+1;
                    count++;
                }else if (array[i]%3 ==2 && array[j]== 1){
                    array[i]=array[i]+1;
                    array[j]=array[j]-1;
                    count++;
                }

            }
        }
        return count;
    }
}
