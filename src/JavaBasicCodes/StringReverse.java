package JavaBasicCodes;

import java.util.Scanner;

public class StringReverse {

    public String reverseString(String str){
        String rev="";
        for (int i =str.length()-1; i >=0; i--){
            char r = str.charAt(i);
            rev =  rev+r;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String Value : ");
        String str = sc.next();
        StringReverse sr = new StringReverse();
        System.out.println(sr.reverseString(str));
    }
}
