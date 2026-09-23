package Strings;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    /*
    public static int longestSubstring(String s){
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();

            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));

                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abcabcbb";

        int answer = longestSubstring(s);
        System.out.println("longest substring: " + answer);
    }

     */

    // << Better Way --> Using HashSet + Sliding Window >>

    public static int longestSubstring(String s){
        int left = 0;
        int right = 0;

        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while(right < s.length()){
            char current = s.charAt(right);

            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            s.add(current);

            maxLength = Math.max(maxlength, right - left + 1);
            right++; 
        }
    }
}
