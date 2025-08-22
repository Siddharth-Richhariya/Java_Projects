package Practice;

public class Arrau {
    public static void revArray(int [] arr) {
        int[] arr2 = new int[arr.length];
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[temp] = arr[i];
            temp++;
        }
        for (int i = 0; i <= arr2.length-1; i++) {
            System.out.print(arr2[i]+" ,");
        }
    }
    public static void sort(int [] arr){
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements in arr for sorting (if that's intent)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
// After sorting, copy arr to arr2
        System.arraycopy(arr, 0, arr2, 0, n);
// Print arr2 elements
        for (int j : arr2) {
            System.out.print(j + " ,");
        }
        System.out.println();
    }
    public static boolean primeNumber(int num){
        if (num ==1 || num <1){
            return false;
        }
        for(int i= 2; i< num; i++ ){
            if(num%i ==0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,34,54,3,65,34,23,65,3,32,3,43,432,54,4};
        revArray(array);
        System.out.println();
        sort(array);
        System.out.println(primeNumber(13));
    }
}
