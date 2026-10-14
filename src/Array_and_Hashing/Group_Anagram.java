package Array_and_Hashing;
import java.util.*; 

public class Group_Anagram {
	
	// << Better Way -- Sort each word and use HashMap >> 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of word: ");
		int n = sc.nextInt();
		
		String[] words = new String[n];
		
		System.out.println("Enter words: ");
		for(int i = 0; i < n; i++) {
			words[i] = sc.next();
		}
		Map<String, List<String>> map = new HashMap<>();
		
		for(String word : words) {
			char[] chars = words.toCharArray();
			
			Arrays.sort(chars);
			String key = new String();
		}
	}

}
