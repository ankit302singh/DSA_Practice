package Strings;

public class Largest_Odd_Number_In_String {
	public static String largestOdd(String num) {
		String largest = "";
		
		for(int i = 0; i < num.length(); i++) {
			for(int j = i+1; j <= num.length(); j++) {
				String current = num.substring(i, j);
				
				if(current.charAt(current.length() - 1) % 2 == 1) {
					if(largest.equals("") || current.length() > largest.length()) {
						largest = current; 
						
					}
					else if(current.length() == largest.length() && current.compareTo(largest) > 0) {
						largest = current; 
					}
				}
			}
		}
		return largest; 
	}
	public static void main(String[] args) {
		
	}

}
