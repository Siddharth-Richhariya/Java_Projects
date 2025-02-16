package LeetCodeQuestions;

public class TestArray {
    public static void main(String[] args) {
      //  arr=[arr=[12234456]
        //
        //output-123456]
       // output-123456\

        int []arr = {1,2,2,3,4,4,5,6};
        int []unique = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            boolean isDuplicate = false;
            for( int j = 0; j< index; j++){
                if (arr[i]==unique[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                unique[index++]= arr[i];
            }
        }





    }
}
