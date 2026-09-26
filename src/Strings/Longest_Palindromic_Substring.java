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
		
		boolean[][] dp = new boolean[n][n];
		
		int start = 0; 
		int maxLength = 1; 
		
		for(int i=0; i < n; i++) {
			dp[i][i] = true; 
		}
		
		for(int length = 2; length <= n; length++) {
			for(int i = 0; i <= n - length; i++) {
				int j = i + length - 1; 
				
				if(str.charAt(i == str.charAt(j))) {
					if(length == 2 || dp[i + 1][j - 1]) {
						dp[i][j] = true; 
						
						if(length > maxLength) {
							start = i; 
							maxLength = length; 
						}
					}
				}
			}
		}
		
	}
}
