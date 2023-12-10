
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {5,2,1,3,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }

    static void bubbleSort(int [] array){
        for (int i=0;i<array.length;i++){
            boolean isSwapped = false;
            for (int j =0;j< array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
}
