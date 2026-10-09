package Array_and_Hashing;
import java.util.*; 

public class Valid_Anagram {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String: ");
		String s1 = sc.next().toLowerCase();
		
		System.out.print("Enter Second : ");
		String s2 = sc.next().toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not a Valid Anagram");
		}
		else {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("Valid ");
			}			else {
				System.out.println("Not Valid");
			}
			
		}
		sc.close();
	}
	*/
	
	// << Better Way -- Using HashMap >> 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st string: ");
		String s1 = sc.next().toLowerCase();
		
		System.out.print("Enter 2nd String: ");
		String s2 = sc.next().toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not a valid Aanagram");
		}
		else {
			Map<Character, Integer> frequency = new HashMap<>();
			
			for(int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
				
				frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
			}
			for(int i = 0; i < s2.length() ; i++) {
				char ch = s2.charAt(i);
				
				
			}
		}
	}

}
