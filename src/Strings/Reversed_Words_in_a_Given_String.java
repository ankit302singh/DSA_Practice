package Strings;
import java.util.Scanner; 

public class Reversed_Words_in_a_Given_String {
	/*
	public static String reverseWord(String s) {
		
		s = s.trim();
		String[] words = s.split("\\s+");
		
		StringBuilder result = new StringBuilder();
		
		for(int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			
			if(i != 0) {
				result.append(" ");
			}
		}
		return result.toString();
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		String answer = reverseWord(s);
		
		System.out.println("Revers String: " + answer);
		sc.close();
		
	}
	*/
	
	// << Better way >> 
	/*
	
	public static String reverseWords(String s) {
		
		StringBuilder result = new StringBuilder();
		
		int i = s.length() - 1; 
		
		while(i >= 0) {
			while(i >= 0 && s.charAt(i) == ' ') {
				i--; 
			}
			if(i < 0) {
				break; 
			}
			
			int end = i ; 
			
			while(i >= 0 && s.charAt(i) != ' ') {
				i--; 
			}
			if(result.length() > 0) {
				result.append(" ");
			}
			result.append(s.substring(i+1, end + 1));
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		System.out.println("Reversed String: "+ reverseWords(s));
		
		sc.close();
	}
	*/
	
	// <<< Optimal Way >>> 
	// 1. Reverse the complete string
	// 2. Reverse every Individual word. 
	// 3. Remove extra spaces. 
	
	public static String reverseWords(String s) {
		s = s.trim();
		
		char[] arr = s.toCharArray();
		
		reverse(arr, 0 , arr.length - 1);
		int start = 0; 
		
		for(int i = 0; i <= arr.length; i++) {
			if(i == arr.length || arr[i] == ' ') {
				reverse(arr, start, i - 1);
				
				start = i + 1; 
			}
		}
	}

}
