package JavaBasicCodes;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student name ");
        String StudentName = sc.next();
        System.out.println("Enter the Student Score: ");
        int Score = sc.nextInt();
        char Grade;
        if (Score >= 90 && Score <= 100){
            Grade = 'A';
        } else if (Score >= 75 && Score < 90) {
            Grade = 'B';
        } else if (Score >= 55 && Score < 75) {
            Grade = 'C';
        } else if (Score >= 40 && Score < 55) {
            Grade = 'D';
        }
        else {
            Grade = 'F';
        }
        System.out.println(StudentName + " "+ "got "+ Grade + " Grade");
    }
}
