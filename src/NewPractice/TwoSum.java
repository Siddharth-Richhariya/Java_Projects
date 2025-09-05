package NewPractice;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,4,6,6,5,8,9,10};
        Set<Integer> set = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        for(int i : n){
            int value = target - i;
                if(set.contains(value)){
                    String pairs = Math.min(i, value)+ " "+ Math.max(i, value);
                    if(!set2.contains(pairs)){
                        System.out.println("Fisrt value :"+ value+" Second value: "+i+ " Target :"+ target);
                    }
                    set2.add(pairs);
                }
            set.add(i);
        }
        System.out.println("second approch");
        for(int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == target) {
                    System.out.println("Fisrt value :" + n[i] + " Second value: " + n[j] + " Target :" + target);
                }
            }
        }
    }

}
