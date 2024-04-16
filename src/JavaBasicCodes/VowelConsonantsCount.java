package JavaBasicCodes;

import java.util.Scanner;

public class VowelConsonantsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Given String :  ");
        int vCount=0;
        int cCount = 0;
        String str = sc.next();
        for (int i =0;i <= str.length()-1; i++){
            char c = str.charAt(i);
            if (c =='a' || c=='i' || c=='e' || c=='o' || c=='u'){
                vCount++;
            }
            else {
                cCount++;
            }
        }
        System.out.println("Number of Vowels : "+ vCount);
        System.out.println("Numbers of Consonants : "+ cCount);
    }
}
