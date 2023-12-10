
import java.util.Scanner;

 class MAKEEQUAL {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i=0;i<size;i++){
                array[i] = scanner.nextInt();
            }
            int min = minValue(array);
            int sum =0;
            for (int i =0;i< array.length;i++){
                sum = sum+array[i];
            }
            int result = sum - (array.length*min);
            System.out.println(result);

        }

    }
    static int minValue(int [] array){
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


}
