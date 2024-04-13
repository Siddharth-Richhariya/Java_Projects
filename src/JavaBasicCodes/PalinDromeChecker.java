package JavaBasicCodes;

import java.util.Scanner;

public class PalinDromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
        StringBuilder str1 = new StringBuilder(str);
        if (str.contentEquals(str1.reverse())){
            System.out.println("PalidDrome String ");
        }
        else {
            System.out.println("Non Palindrome String");
        }
        sc.close();
    }
}
