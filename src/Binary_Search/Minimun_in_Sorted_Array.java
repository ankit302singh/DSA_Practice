package Binary_Search;
import java.util.Scanner; 

public class Minimun_in_Sorted_Array {
	/*
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum Element: " + findMin(arr));
	}
	
	*/
	
	// <<< Optimal Way (Binary Search) >>>
	
	public static int findMin(int[] arr) {
		int low = 0; 
		int high = arr.length - 1; 
		
		int ans = Integer.MAX_VALUE ; 
		
		while(low <= high) {
			int mid = low + (high - low)/2; 
			
			if(arr[low] <= arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid + 1; 
			}
			else {
				ans = Math.min(ans, arr[mid]);
				high = mid - 1; 
			}
		}
		return ans; 
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Element: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum = " + findMin(arr));
	}

}
