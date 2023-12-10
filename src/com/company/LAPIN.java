
import java.util.Arrays;
import java.util.Scanner;

 class LAPIN {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            String str1 = str.substring(0,str.length()/2);
            String str2;
            if(str.length()%2==0){
                 str2 = str.substring(str.length()/2, str.length());
            }else str2 = str.substring(str.length()/2+1, str.length());
                StringBuffer sb = new StringBuffer(str2);
                sb.reverse();
                String str3 = sb.toString();
                if (str1.equals(str2) || str1.equals(str3)){
                    System.out.println("YES");
                }else System.out.println("NO");
//            char[] ch1=str1.toCharArray();
//            char[] ch2=str2.toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//
//            if(Arrays.equals(ch1,ch2))
//            {
//                System.out.println("YES");
//            }
//            else
//            {
//                System.out.println("NO");
//            }
            }
        System.exit(0);
    }

//    static StringBuffer startString (String str){
//        StringBuffer newString = new StringBuffer() ;
//        String [] stringArray = new String[str.length()/2];
//        for (int i=0;i<str.length()/2;i++){
//           stringArray[i]= String.valueOf(str.charAt(i));
//        }
//        for (int i =0; i<str.length()/2;i++){
//            newString.append(stringArray[i]);
//        }
//        return newString;
//    }
//
//    static StringBuffer endString (String str){
//        StringBuffer newString = new StringBuffer() ;
//        String [] stringArray = new String[str.length()];
//
//        char [] myString = stringToArray(str);
//        String str1 = String.copyValueOf(myString,0,str.length()/2);
//        String str2 = String.copyValueOf(myString,(str.length()+1)/2,str.length()/2);
//        for (int i = (str.length()+1)/2; i<str.length();i++){ //rotor
//            stringArray[i]= String.valueOf(str.charAt(i));
//        }
//        for (int i =0; i<str.length()/2;i++){
//            newString.append(stringArray[i]);
//        }
//        return newString;
//    }
//
//    static  char[] stringToArray(String str){
//
//        char [] myString = new char[str.length()];
//        for (int i=0;i<str.length();i++){
//            myString[i] = str.charAt(i);
//        }
//        return myString;
//    }

}
