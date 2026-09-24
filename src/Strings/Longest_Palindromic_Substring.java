package Strings;

public class Longest_Palindromic_Substring {
    public String longestPandlindrome(String s){
        String longest = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String substring = s.substring(i, j+1);

                if(isPalindrome(substring)){
                    if(substring.length() > longest.length()){
                        longest = substring;
                    }
                }
            }
        }
        return longest;
    }
    public boolean isPalindrome(String s ){

        return true; 
    }

}
