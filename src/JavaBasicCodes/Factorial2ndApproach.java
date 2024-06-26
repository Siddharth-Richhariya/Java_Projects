package JavaBasicCodes;

import java.math.BigInteger;
import java.util.Scanner;


public class Factorial2ndApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        // for value of fact more than 65 takes more time if calculation is larger
        BigInteger num = sc.nextBigInteger();
        BigInteger fact = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE;
             i.compareTo(num) <= 0;
             i = i.add(BigInteger.ONE)) {
                 fact = fact.multiply(i);
        }
        System.out.println("Factorial of Given Number : "+fact);
    }
}
