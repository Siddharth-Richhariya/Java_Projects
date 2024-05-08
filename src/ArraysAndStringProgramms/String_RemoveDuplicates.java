package ArraysAndStringProgramms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class String_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet <Character> set = new LinkedHashSet<>();

        char [] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            set.add(charArray[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
