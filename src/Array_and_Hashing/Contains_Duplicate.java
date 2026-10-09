package Array_and_Hashing;
import java.util.Scanner; 
import java.util.*;

public class Contains_Duplicate {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean duplicate = false; 
		
		for(int i=0; i< n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					duplicate = true; 
					break; 
				}
			}
			if(duplicate) {
				break; 
			}
		}
		System.out.println("Contains Duplicate: "+ duplicate);
		sc.close();
	}
	*/
	
	// << Better Version (Sort the Array) >> 
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter elements: ");
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		boolean duplicate = false; 
		
		for(int i = 1; i < n ; i++) {
			if(arr[i] == arr[i - 1]) {
				duplicate = true; 
				break; 
			}
		}
		System.out.println("contains Duplicate: " + duplicate);
		
		sc.close();
	}
	*/
	
	// << Optimal Way -- HashSet >>> 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter element: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		HashSet<Integer> set = new HashSet<>();
		boolean duplicate = false; 
		
		for(int i = 0; i < n; i++) {
			if(set.contains(arr[i])) {
				duplicate = true; 
				break; 
			}
			set.add(arr[i]);
		}
		System.out.println("Contains Dup: "+ duplicate);
		sc.close();
	}

}
