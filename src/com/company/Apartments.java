
import java.util.Arrays;
import java.util.Scanner;

class Apartments {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int [] array = updateArray(n);
        int [] arrayAvailable = updateArray(m);
        int count =0;
//        for (int j=0;j<arrayAvailable.length;j++){
//            for (int i=0;i<array.length;i++){
//                if ((arrayAvailable[j]>=(array[i]-k))&& (arrayAvailable[j]<=(array[i]+k))){
//                    count++;
//                    break;
//                }
//            }
//        }
        Arrays.sort(array);
        Arrays.sort(arrayAvailable);
        for (int i=0;i<array.length;i++){
            for (int j =0; j< arrayAvailable.length;j++){
                if ((arrayAvailable[j]>=(array[i]-k))&& (arrayAvailable[j]<=(array[i]+k))){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
    static int [] updateArray(int numbers){
        int [] array =new int[numbers];
        for (int i=0;i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
}
//45,60,60,80
//30,60,75