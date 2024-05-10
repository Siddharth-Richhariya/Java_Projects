package ArraysAndStringProgramms;

public class TwoDArray_SelectDiagonalElements {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Primary Diagonal: ");
        primaryDiagonals(arr); // >> 1 , 5, 9
        System.out.println("Secondary Diagonal: ");
        secondaryDiagonals(arr); // >> 3, 5, 7
    }
    public static void primaryDiagonals(int [][]arr){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void secondaryDiagonals(int [][]arr){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                if((i+j)== arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
