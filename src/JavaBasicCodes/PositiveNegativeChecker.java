package JavaBasicCodes;

import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        PNChecker(num);
    }
    public static void PNChecker(int num){
        if (num >= 1){
            System.out.println("Positive Number");
        }else if (num  < 0){
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }
    }
}
