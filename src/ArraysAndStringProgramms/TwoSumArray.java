package ArraysAndStringProgramms;

import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        int arr[]= {1, 3, 2, 2, 7, 8, 9, 11, 12};
        getTargetedValus(arr);
    }
    static void getTargetedValus(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Target: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" ,"+arr[j]);
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("There are no values as per the required condition");
        }
    }
}
