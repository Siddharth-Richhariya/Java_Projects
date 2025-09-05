package NewPractice;

import java.util.*;;

public class FrequescyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        String str = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            if(c != ' '){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        for(Map.Entry<Character, Integer> map1: map.entrySet()){
            if(map1.getValue() != 1){
                System.out.println(map1.getKey()+" : "+map1.getValue());
            }
        }


    }
}
