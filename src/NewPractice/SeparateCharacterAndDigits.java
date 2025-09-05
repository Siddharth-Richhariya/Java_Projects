package NewPractice;

import java.util.Scanner;

public class SeparateCharacterAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String isLetter = "";
        String isDigit = "";
        String sCharcter = "";
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                isLetter += c;
            } else if (Character.isDigit(c)) {
                isDigit += c;
            }
            else {
                sCharcter += c;
            }
        }
        sc.close();
        System.out.println("Letters : "+isLetter+"\nDigit : "+isDigit+"\nSpecial Chracter: "+sCharcter);
    }
}
