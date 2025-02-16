package LeetCodeQuestions;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,5,5,6,2,3,6};
        int largest = 0;
        int secondLargest = 0;
        int thirdlargest = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]> largest){
                secondLargest = largest;
                thirdlargest =secondLargest;
                largest = arr[i];
            }
        }

        System.out.println("thirdlargest: "+thirdlargest);
        System.out.println("Second largest: "+secondLargest);
        System.out.println("largest: "+largest);
    }
}
