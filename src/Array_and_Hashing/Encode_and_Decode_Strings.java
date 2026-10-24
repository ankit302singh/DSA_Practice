package Array_and_Hashing;
import java.util.*; 

public class Encode_and_Decode_Strings {
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
		return Arrays.asList(encoded, split("#", -1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of String: ");
		int n = Integer.parseInt(sc.nextLine());
	}

}
