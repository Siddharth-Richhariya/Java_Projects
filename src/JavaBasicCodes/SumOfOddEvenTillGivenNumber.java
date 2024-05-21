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
        int even =0;
        int odd = 0;
        int evenCount = 0;
        int oddCount = 0;
        int i=1;
        while(i<=n){
            if (i%2==0){
                even+=i;
                evenCount++;
            }
            else {
                odd += i;
                oddCount++;
            }
            i++;
        }
        System.out.println("Sum Of Even : "+ even+ " & Even Numbers Count : "+ evenCount);
        System.out.println("Sum Of Odd :  "+ odd+ " & Odd Numbers Count : "+ oddCount);
    }
}
