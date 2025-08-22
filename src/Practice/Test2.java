package Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
    public static boolean Anagramcheck(String a, String b){
        if (a==null || b ==null){
            return false;
        }
        String x = a.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String y = b.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if(x.length() != y.length()){
            return false;
        }
        char[] ca = x.toCharArray();
        char[] cb = y.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }
 public static void main(String[] args){
     System.out.println("String Reverse");
     String in= "manazone";
     String rev = "";
     for(int i = in.length()-1; i >= 0; i--){
         rev += in.charAt(i);
     }
     System.out.println(rev);
     System.out.println(in.length());

     System.out.println();
     System.out.println("Swap Number");
     int a = 10;
     int b = 5;
     a = a*b;
     b = a/b;
     a = a/b;
     System.out.println("A="+a+" B="+b);
     System.out.println();
     System.out.println("Anagram Check");
     System.out.println(Anagramcheck("ramn!", "nmar"));
     System.out.println();
     System.out.println("Remove Duplicate from String");
     String name= "Siddharth";
     String unique = "";
     Set<Character> set = new LinkedHashSet<>();
     for(int i = 0; i<=name.length()-1; i++){
         set.add(name.charAt(i));
     }
     for(char d : set){
         unique += d;
     }
     System.out.println(unique);
     System.out.println();
     System.out.println("Remove Duplicate from Array");
     int[] array = {1,34,54,3,65,34,23,65,3,32,3,43,432,54,4};
     Set<Integer> set1 = new LinkedHashSet<>();
     for(int e: array){
         set1.add(e);
     }
     System.out.println(set1);

     System.out.println();
     System.out.println("Factorial value");
     int f = 5;
     int g= 1;
     for(int i =f; i >= 1; i--){
         g *=  i;
     }
     System.out.println(g);
 }
}

