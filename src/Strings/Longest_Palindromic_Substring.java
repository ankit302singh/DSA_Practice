package Strings;

import java.util.Scanner;

public class Longest_Palindromic_Substring {
	/*
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

    }
    */
	
	// << Better way via Dynamic programming >> 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		int n = str.length();
		
	}
}
