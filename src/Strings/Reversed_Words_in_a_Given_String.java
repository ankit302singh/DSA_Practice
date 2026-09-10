package Strings;
import java.util.Scanner; 

public class Reversed_Words_in_a_Given_String {
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
		
	}

}
