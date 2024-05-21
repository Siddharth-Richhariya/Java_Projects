package JavaBasicCodes;


public class DuplicatesArrayIndexValue {
    static void  Duplicate(int []arr){
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value: " + arr[i]);
                    foundDuplicate = true;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No Duplicate Values");
        }
    }
    public static void main(String[] args) {
        int []arr = {3,5,6,2,6,3,7,8,0};
        Duplicate(arr);
    }
}
