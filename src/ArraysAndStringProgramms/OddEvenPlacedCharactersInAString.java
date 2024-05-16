package ArraysAndStringProgramms;

import java.util.Scanner;

public class OddEvenPlacedCharactersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        selectStringByPosition(str);
    }
    public static void selectStringByPosition (String str) {
        StringBuilder oddChar = new StringBuilder();
        StringBuilder evenChar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (i % 2 == 0) {
                oddChar.append(character);
            } else {
                evenChar.append(character);
            }
        }
        System.out.println("Odd Placed Charcters : "+oddChar);
        System.out.println("Even Placed Charcters : "+evenChar);

    }
}
