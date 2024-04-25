package JavaBasicCodes;

import java.util.Scanner;

public class SwitchArthmaticProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the Arthmatic Oprator : ");
        char ao = sc.next().charAt(0);
        switch (ao){
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '/' -> System.out.println(num1 / num2);
            case '*' -> System.out.println(num1 * num2);
            case '%' -> System.out.println(num1 % num2);
        }
    }

}
