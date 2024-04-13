package JavaBasicCodes;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of First Line of the Triangle : ");
        int lineOne = sc.nextInt();
        System.out.println("Enter the length of Second Line of the Triangle : ");
        int linetwo = sc.nextInt();
        System.out.println("Enter the length of Third Line of the Triangle : ");
        int lineThree = sc.nextInt();
        if (lineOne == linetwo && lineThree == linetwo){
            System.out.println("Equilateral triangle");
        }
        else if (lineOne == linetwo || lineOne == lineThree || linetwo == lineThree){
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }

    }
}
