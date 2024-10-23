package ArraysAndStringProgramms;

public class SecondHighestInArray {

    public static void main(String[] args) {
        int []arr = {1,82,54,32,76,43,87,32,76};
        findSecondHighest(arr);
    }

    static void findSecondHighest(int []arr){
        int highest= Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int number : arr){
            if(number > highest){
                secondHighest = highest;
                highest = number;
            }
        }
        System.out.println("Second Highest Number in Array: "+secondHighest);
    }
}
