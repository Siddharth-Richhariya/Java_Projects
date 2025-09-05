package NewPractice;

import java.util.*;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Uniq ="";
        Set<Character> set = new LinkedHashSet<>();
        for(char c : str.toLowerCase().toCharArray()){
            if(c != ' ' && !set.contains(c)){
                set.add(c);
                Uniq += c;
            }
        }
        System.out.println(Uniq);
    }
}
