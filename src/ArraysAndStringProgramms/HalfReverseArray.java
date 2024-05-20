package ArraysAndStringProgramms;

public class HalfReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0, j = (arr.length/2)-1; i < j; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
        for(int x : arr){
            System.out.print(x+" "); // 5 4 3 2 1 6 7 8 9 0
        }
    }
}