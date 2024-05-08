package ArraysAndStringProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1 ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2 ");
        String str2 = sc.nextLine();
        System.out.println(strAngrams(str1,str2));
    }
    public static boolean strAngrams(String str1, String str2){
        char [] arr1 = str1.toLowerCase().toCharArray();
        char [] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
