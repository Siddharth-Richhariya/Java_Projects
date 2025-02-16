package LeetCodeQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        String str= "testtest";
        countCharters(str);
    }
    public static void countCharters(String str){
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                c = Character.toLowerCase(c);
                charCount.put(c, charCount.getOrDefault(c, 0)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+ "="+ entry.getValue());
            }
        }
    }


   // Output => t=4, e=2, s=2
}
