package StreamAPIs;

import java.util.Arrays;
import java.util.List;

public class SquareRootTheListEvenNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(12,43,21,48,42,3,32,3,5,66,5,67,2);
        myList.stream().
                filter(x-> x % 2 ==0).
                map(Math::sqrt).
                sorted((a, b)-> (int) (b - a)).
                forEach(System.out::println);
    }
}