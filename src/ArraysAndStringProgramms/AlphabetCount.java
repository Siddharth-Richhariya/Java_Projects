package ArraysAndStringProgramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlphabetCount {
    public static void main(String[] args) {
        String input = "I use programming language Java";
        alphabetCount(input);
    }

    static void alphabetCount(String str){
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            if (Character.isLetter(c)){
                c = Character.toLowerCase(c);
                charCount.put(c, charCount.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ ":"+ entry.getValue());
            }
        }
    }

}
