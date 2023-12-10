
import java.util.Scanner;

class MINDAYSRET {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int numberOfStudents = scanner.nextInt();
            int days = scanner.nextInt();
            int result;
           if (numberOfStudents%days==0){
                result = numberOfStudents/days;
           }else result = numberOfStudents/days+1;

            System.out.println(result);
        }
    }
}
