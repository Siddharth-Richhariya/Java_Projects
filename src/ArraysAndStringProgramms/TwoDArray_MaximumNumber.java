package ArraysAndStringProgramms;

import java.util.Scanner;

public class TwoDArray_MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter the Row Size: ");
        int row = sc.nextInt();
        System.out.println("Enter the Column Size: ");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for(int i = 0; i< arr.length; i++){
            for (int j= 0; j< arr[i].length; j++){
                System.out.println("Enter the Values in Array: ");
                arr [i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0; i< arr.length; i++){
            for (int j= 0; j< arr[i].length; j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Number in the array : "+max);
    }
}
