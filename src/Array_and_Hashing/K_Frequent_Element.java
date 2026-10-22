package Array_and_Hashing;
import java.util.*; 

public class K_Frequent_Element {
	/*
	// << Better Way - HashMap + Sorting >> 
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array Size: ");
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	
	System.out.println("Enter Array Element: ");
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.print("Enter K: ");
	int k = sc.nextInt();
	
	Map<Integer, Integer> map = new HashMap<>();
	
	for(int num : arr) {
		map.put(num, map.getOrDefault(num, 0) + 1);
	}
	
	if(k < 1 || k > map.size()) {
		System.out.println("Invalid K");
		sc.close();
		return; 
	}
	List<Integer> elements = new ArrayList<>(map.keySet());
	
	elements.sort((a,b) -> Integer.compare(map.get(b), map.get(a)));
	System.out.println("Top K frequent elments: ");
	
	for(int i = 0; i < k; i++) {
		System.out.print(elements.get(i) + " ");
	}
	sc.close();
	
	}
	*/
	
	// << Optimal Way HashMap + Bucket Sort >> 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter element: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
}
