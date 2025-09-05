package NewPractice;

import java.util.*;
// Array input = [cat, act, ant, nat]
// Array output = [cat2, ant2]

public class trweks {

    public static void main(String[] args) {
        String [] str = {"cat", "act", "ant","nat"};

        Map<String, List<String>> map = new LinkedHashMap<>();
        for(String words: str){
            char[] c = words.toCharArray();
            Arrays.sort(c);
            String sort = new String(c);
            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(words);
        }

        for(List<String> group: map.values()){
            String str3 = group.get(0);
            int count = group.size();
            System.out.println(str3+count);
        }

        for(Map.Entry<String, List<String>> map1: map.entrySet()){
            System.out.println(map1.getKey()+2+""+ map1.getValue());
        }

    }
}
