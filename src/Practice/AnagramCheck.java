package Practice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String a = "mand";
        String b = "namd";
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        if (x.length()!= y.length()){
            System.out.println("Not Anagram");
        }
        char[] sb = y.toCharArray();
        char[] sa = x.toCharArray();
        Arrays.sort(sb);
        Arrays.sort(sa);
        System.out.println(Arrays.equals(sb, sa));



    }
}
