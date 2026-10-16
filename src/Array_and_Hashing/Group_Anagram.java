package Array_and_Hashing;
import java.util.*; 

public class Group_Anagram {
	/*
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
			char[] chars = word.toCharArray();
			
			Arrays.sort(chars);
			String key = new String(chars);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
		}
		List<List<String>> result = new ArrayList<>(map.values());
		System.out.println("Group Anagram: " + result);
		sc.close();
		
	}

	 */

	// <<< Optimal Way - Character frequency + HashMap >>>

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words: ");
		int n = sc.nextInt();

		String[] words = new String[n];
		System.out.println("Enter words: ");
		for(int i = 0; i < n; i++){
			words[i] = sc.next();
		}
		Map<String, List<String>> map = new HashMap<>();
		for(String word : words){
			int[] freq = new int[26];

			for(int i = 0; i < word.length(); i++){
				char ch = word.charAt(i);
				freq[ch - 'a']++;
			}
			StringBuilder keyBuilder = new StringBuilder();

			for(int count : freq){
				keyBuilder.append(count).append('#');
			}
			String key = keyBuilder.toString();

			if(!map.containsKey(key)){
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
		}
		List<List<String>> result = new ArrayList<>(map.values());

		System.out.println("Grouped Anagram: " + result);
		sc.close();
	}

}
