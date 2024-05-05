package ArraysAndStringProgramms;

import java.util.Scanner;

public class StringReverseUsingRecursion {
    public static String reverse(String str){
        if (str.isEmpty()){
            //System.out.println(str);
            return str;
        }
        else {
            System.out.println(str);
            String rev = reverse(str.substring(1));
            return rev+str.charAt(0);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
        sc.close();

    }
}
