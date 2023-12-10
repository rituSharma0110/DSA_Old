
import java.util.Scanner;

 class CAC104 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextByte();
//        scanner.next();
        while (tc-->0){
        String str = scanner.next();
        if (str.equals("milk")){
            System.out.println("sugar");
        }
        else System.out.println("milk");
        }
    }
}
