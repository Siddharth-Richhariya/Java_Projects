package ArraysAndStringProgramms;

import java.util.Scanner;

public class TakeAndPrintMarks {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of subjects: ");
        int [] Subjects = new int[sc.nextInt()];
        for(int i = 0; i < Subjects.length; i++){
            System.out.println("Enter the marks of subject");
            Subjects[i]= sc.nextInt();
        }
        for(int j= 0; j<Subjects.length;  j++){
            total = total + Subjects[j];
        }
        System.out.println("Total Marks : "+ total);
    }
}
