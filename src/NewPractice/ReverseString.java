package NewPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev ="";
        for(char c : str.toCharArray()){
            if(c != ' '){
                rev= c+ rev;
            }
        }
        System.out.println(rev);
    }
}
