package ArraysAndStringProgramms;

import java.util.Scanner;

public class TakeAndPrintMarks {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of subjects: ");
        int [] subjects = new int[sc.nextInt()];
        for(int i = 0; i < subjects.length; i++){
            System.out.println("Enter the marks of subject "+ (i+1)+" :");
            int marks = sc.nextInt();
            if (marks > 100 || marks < 0) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                i--;
            } else {
                subjects[i] = marks;
            }
        }
        for (int j =0; j< subjects.length; j++) {
            if (subjects[j] <= 35) {
                System.out.println("Failed in this Subject: "+ (j + 1) + ": "  + subjects[j]);
            }
            total = total + subjects[j];
        }
        System.out.println("Total Marks : "+ total + "/"+subjects.length*100);
    }
}
