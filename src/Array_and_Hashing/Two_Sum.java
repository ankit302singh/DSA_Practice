package Array_and_Hashing;
import java.util.*; 

public class Two_Sum {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n  = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Element: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		boolean found = false; 
		
		for(int i = 0; i < n ; i++) {
			for(int j = i + 1; j < n ; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println("Indices " + i + " and"+ j);
					found = true; 
					break; 
				}
			}
			if(!found) {
				System.out.println("No pair found");
			}
		}
	}
	 */
// <<< Optimal Way -- via HashMap >>>

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array Element: ");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Target: ");
		int target = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		boolean found = false;

		for(int i = 0; i < n; i++){
			int required = target - arr[i];

			if(map.containsKey(required)){
				System.out.println("Indices: "+ map.get(required)+ " and "+ i);
				found = true;
				break;
			}
			map.put(arr[i], i);
		}
		if(!found){
			System.out.println("No pair found");
		}
		sc.close();
	}
}
