package ArraysAndStringProgramms;

import java.util.Scanner;

public class DoubleValueofAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int [] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the values of an array: ");
            arr[i]= sc.nextInt();
        }
        int [] arr2 = new int[arr.length];
        for(int j=0; j < arr.length;j++){
            arr2[j] = arr[j]*2;
        }
        System.out.println("Before : ");
        for(int k : arr){
            System.out.print(k+", ");
        }
        System.out.println();
        System.out.println("After : ");
        for(int j : arr2){
            System.out.print(j+", ");
        }
    }
}
