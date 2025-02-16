package LambdaExpression.CollectionsP;

import java.util.Map;
import java.util.TreeMap;

public class OnMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>((a , b) -> b - a);
        map.put(1, "Siddharth");
        map.put(3, "Shabbir");
        map.put(2, "Gourav");
        map.put(4, "Vicky");
        map.put(6, "Yash");
        map.put(5, "Karan");

        System.out.println(map);
    }
}
