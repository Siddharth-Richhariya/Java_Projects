package NewPractice;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        String rev = "";

        for(String str1: str2){
            rev = str1 + " "+ rev;
        }
        System.out.println(rev);
    }
}
