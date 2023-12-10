
import java.util.Scanner;

class FLOW007 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
//            Integer number = scanner.nextInt();
//            String str = number.toString();
//            StringBuilder sb = new StringBuilder(str);
//            sb.reverse();
//            System.out.println(sb);
            int number = scanner.nextInt();

                int remainder = 0;
                int reversed = 0;
                while (number!=0) {
                    remainder = number % 10;
                    reversed = reversed * 10 + remainder;
                    number = number/10;
                }
            System.out.println(reversed);

        }



        System.exit(0);

    }

}
