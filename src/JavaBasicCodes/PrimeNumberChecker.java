package JavaBasicCodes;

import java.util.Scanner;

public class PrimeNumberChecker {
    public Boolean PrimeNumber(int num){
        if (num == 1){
            return true;
        } else if ((num <= 1)) {
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        PrimeNumberChecker pn = new PrimeNumberChecker();
        boolean isPrime = pn.PrimeNumber(num);
        if(isPrime){
            System.out.println("Prime Number ");
        }
        else {
            System.out.println("Not a Prime Number ");
        }


    }

}
