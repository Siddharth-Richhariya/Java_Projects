package LeetCodeQuestions;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] v = {"flower", "flight", "flow"};
        System.out.println(longestCommonPrefix(v));
    }

    public static String longestCommonPrefix(String[] v) {
        if (v == null || v.length == 0) {
            return "";
        }

        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
