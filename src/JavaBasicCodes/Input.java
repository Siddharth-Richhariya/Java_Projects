package JavaBasicCodes;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner sc = new Scanner(System.in);
        int ii= sc.nextInt();
        double dd = sc.nextDouble();
        sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println(i+ii);
        System.out.println(d+dd);
        System.out.println(s.concat(str1));


    }
}
