package LeetCodeQuestions;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        String[] items = {"banana", "apple", "apple", "orange", "banana", "apple", "banana"};
        Map<String, Integer> myList = new HashMap<>();

        List<String> mSI = new ArrayList<>();
        int maxCount = 0;

        for(String item: items){
            int count = myList.getOrDefault(item, 0)+1;
            myList.put(item, count);
            if(count> maxCount){
                maxCount = count;
                mSI.clear();
                mSI.add(item);
            } else if (count == maxCount) {
                mSI.add(item);
            }
        }

        mSI = new ArrayList<>(new HashSet<>(mSI));

        System.out.println("Frequency of item"+ myList);
        System.out.println("Most Sold item "+ mSI+" Count"+ maxCount);
    }

}

/*
You are given a list of strings that represent various
items sold in a store
"apple", "banana", "apple", "orange", "banana", "apple"

Counts the frequency of each item sold.
Finds the item that has been sold the most.
 */
