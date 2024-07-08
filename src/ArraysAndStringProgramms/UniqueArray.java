package ArraysAndStringProgramms;

public class UniqueArray {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 3, 6, 7, 9, 8, 5, 18};
        uniqueArray(arr);
    }
    static void uniqueArray(int [] arr){
        int arr2[]= new int[arr.length];
        int index = 0;
        for(int i= 0; i < arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < index; j++){
                if (arr[i] == arr2[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr2[index++] = arr[i];
            }
        }

        for( int i = 0; i < arr2.length-1; i++){
            System.out.println(arr2[i]);
        }

    }
}
