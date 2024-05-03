package ArraysAndStringProgramms;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int [] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the values of an array: ");
            arr[i]= sc.nextInt();
        }
        for (int j= 0; j<arr.length; j++){
            if (arr[j]>= max){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
