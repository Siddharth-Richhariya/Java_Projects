package JavaBasicCodes;
import java.util.Scanner;

public class ReverseInteger {
    static int Reverse(int num){

        int rev = 0;
        while (num !=0){
         int rem =  num % 10;
         rev = rem + rev*10;
         num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int num = sc.nextInt();
        System.out.println(Reverse(num));

    }
}
