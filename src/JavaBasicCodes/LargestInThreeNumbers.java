package JavaBasicCodes;

import java.util.Scanner;

public class LargestInThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3 : ");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Num 1 is the the largest");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Num 2 is the the largest");
        }
        else if (num3>num1 && num3>num2){
            System.out.println("Num 3 is the the largest");
        }else{
            System.out.println("Largest Two or all values are same");
        }

    }
}
