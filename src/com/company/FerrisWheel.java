
import java.util.Arrays;
import java.util.Scanner;

public class FerrisWheel {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfChildren = scanner.nextInt();
        int maxAllowedWeight = scanner.nextInt();
        int [] array = new int[numberOfChildren];
        for (int i=0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int result = gondolas(array, maxAllowedWeight,numberOfChildren);
        System.out.println(result);

    }

    static int gondolas(int [] array, int max, int number) {
        int count = number;
        int j = array.length-1;
        int i =0;
        while (i<j){
            if (array[i] + array[j] <= max){
                count--;
                i++;
                j--;
            }else {
                j--;
            }
        }
        return count;
    }
}
