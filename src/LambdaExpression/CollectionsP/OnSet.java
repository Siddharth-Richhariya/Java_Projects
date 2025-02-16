package LambdaExpression.CollectionsP;

import java.util.Set;
import java.util.TreeSet;

public class OnSet {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>((a, b)-> b - a);
        set.add(10);
        set.add(101);
        set.add(14);
        set.add(56);
        set.add(80);

        System.out.println(set);
    }
}
