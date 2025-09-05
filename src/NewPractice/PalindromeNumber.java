package NewPractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int rem = temp % 10;
            rev = rev * 10+ rem;
            temp /= 10;
        }
        if (rev == num){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}