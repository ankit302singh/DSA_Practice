package Array_and_Hashing;
import java.util.*; 

public class K_Frequent_Element {
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
	
	}
}
