package Binary_Search;
import java.util.*; 

public class Kth_Missing_Positive_number {
	/*
	public static int findKthMissing(int[] arr, int k) {
		int number = 1; 
		
		while(true) {
			boolean found = false; 
			for(int value : arr) {
				if(value == number) {
					found = true; 
					break; 
				}
			}
			if(!found) {
				k--; 
			}
			if(k == 0) {
				return number; 
			}
			number++;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		System.out.println("Kth Missing: " + findKthMissing(arr,k));
		sc.close();
	}
    */
	
	// <<< Better Way ( HashSet ) >>>
	
	public static int findKthMissing(int[] arr, int k) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int value : arr) {
			
		}
	}
}
