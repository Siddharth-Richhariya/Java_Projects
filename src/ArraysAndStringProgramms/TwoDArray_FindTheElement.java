package ArraysAndStringProgramms;

import java.util.Scanner;

public class TwoDArray_FindTheElement {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element want to Search :");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (num == arr[i][j]) {
                    found = true;
                    System.out.println("Row: "+(i+1)+" ,Coloumn : "+(j+1));
                }
            }
            if(found){
                break;
            }
        }
        System.out.println(found);
    }
}


