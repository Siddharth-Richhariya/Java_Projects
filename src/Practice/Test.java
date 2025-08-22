package Practice;

import java.util.HashMap;
import java.util.Map;

class Test{
        public static void main(String[] args) {
            Map<String, Integer> hm = new HashMap<>();
            hm.put("Apple", 10);
            hm.put("Bananna", 20);
            hm.put("mango", 30);

            for (Map.Entry<String, Integer> hmk : hm.entrySet()){
                System.out.println(hmk.getKey()+ ":" + hmk.getValue());
            }
            System.out.println("After Putting Value \n"+ hm.get("Bananna") );
            hm.put("Elppa", 40);

            for(Map.Entry<String, Integer> hmklj : hm.entrySet()){

                System.out.println(hmklj.getKey()+" : "+ hmklj.getValue());

            }



        }
    }





