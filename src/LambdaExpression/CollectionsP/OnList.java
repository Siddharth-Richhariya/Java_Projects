package LambdaExpression.CollectionsP;

import java.util.*;

public class OnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(101);
        list.add(14);
        list.add(56);
        list.add(80);
        Collections.sort(list, (a, b)-> b - a); // For Descending order i have used Lambda Expre.
//        list.sort((a,b)->b-a);
        System.out.println(list);




    }
}
