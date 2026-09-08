package Strings;

public class Remove_Outermost_Parentheses {
// <<< Normal Way >>> 
	/*
	public static String removeOuter(String s) {
		
		String result = "";
		
		int count = 0; 
		int start = 0; 
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				count++; 
			}
			else {
				count--; 
			}
			
			if(count == 0) {
				String primitive = s.substring(start, i+1);
				result += primitive.substring(1, primitive.length() - 1);
				start = i+ 1; 
			}
		}
		return result; 
	}
	
	public static void main(String[] args) {
		String s = "(()())(())"; 
		System.out.println(removeOuter(s));
	}
	*/
	
	// <<< Better Way >>> 
	/*
	public static String removeOuter(String s) {
		
		String result = "";
		
		int count = 0; 
		
		for(int i=0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				if(count > 0) {
					result += ch; 
				}
				count++; 
			}
			else {
				count--; 
				
				if(count > 0) {
					result += ch; 
				}
			}
		}
		
		return result; 
	}
	
	public static void main(String[] args) {
		String s = "(()())(())";
		
		System.out.println(removeOuter(s));
	}
	*/
	
	// <<< Optimal Way (Using StringBuilder) >>>
	
	public static String removeOuter(String s) {
		StringBuilder result = new StringBuilder();

		int count = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == '('){
				if(count > 0){
					result.append(ch);
				}
				
		return result.toString();
	}

}
