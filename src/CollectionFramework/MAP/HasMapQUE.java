package CollectionFramework.MAP;

import java.util.*;

public class HasMapQUE {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"Siddharth");
        hm.put(2, "vicku");
        hm.put(3, "Akash");
        hm.put(4, null);
        List<String> lis = new ArrayList<>();
        hm.values().stream().sorted();
        System.out.println(lis);
        String s1 = "vicky";
        String s2 = "vicky";
        String s3 = new String("vicky");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);


        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("test");
        } finally {
            System.out.println("inside ");
        }
    }
}
