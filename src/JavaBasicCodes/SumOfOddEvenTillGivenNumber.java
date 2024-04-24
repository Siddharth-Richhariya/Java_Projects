package JavaBasicCodes;

import java.util.Scanner;

public class SumOfOddEvenTillGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        Sum(num);
    }
    public static void Sum(int n){
        int sum =0;
        int odd = 0;
        for (int i = 0; i <=n; i++){
            if (i%2==0){
                sum+=i;
            }
            else {
                odd += i;
            }
        }
        System.out.println("Sum Of Odd :  "+ odd);
        System.out.println("Sum Of Even : "+ sum);
    }
}
