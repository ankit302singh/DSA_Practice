package Array_and_Hashing;
import java.util.*; 

public class Encode_and_Decode_Strings {
	/*
	public static String encode(List<String> str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.size(); i++) {
			sb.append(str.get(i));
			
			if(i != str.size() - 1) {
				sb.append("#");
			}
		}
		return sb.toString();
	}
	
	public static List<String> decode(String encoded){
		return Arrays.asList(encoded.split("#", -1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of String: ");
		int n = Integer.parseInt(sc.nextLine());

		List<String> str =  new ArrayList<>();
		System.out.println("Enter String: ");

		for(int i = 0; i < n; i++){
			str.add(sc.nextLine());
		}
		String encoded = encode(str);
		System.out.println("Encode_Strings: "+ encoded);

		List<String> decoded = decode(encoded);
		System.out.println("Decode_Strings: " + decoded);
		sc.close();
	}

 */

	// << Optimal Way -- Length- prefix encoding>>

	public static String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();

		for (String str : strs) {
			sb.append(str.length());
			sb.append("#");
			sb.append(str);
		}
		return sb.toString();
	}

	public static List<String> decode(String encoded) {
		List<String> result = new ArrayList<>();
		int i = 0;

		while (i < encoded.length()) {
			int separator = encoded.indexOf('#', i);
			int length = Integer.parseInt(encoded.substring(i, separator));
		}
		int start = separator + 1;
		int end = start + length;

		result.add(encoded.substring(start, end));

		i = end;
	}
	return result;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of string: ");
	int n = Integer.parseInt(sc.nextLine());

	List<String> strs = new ArrayList<>();

	System.out.println("Enter Strings: ");

	for(int i = 0; i < n; i++){
		strs.add(sc.nextLine());
	}
}

