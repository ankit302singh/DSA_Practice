package Binary_Search;
import java.util.Scanner; 

public class Single_Element_In_Sorted_Array {
	/*
	public static int singleElement(int[] arr) {
		int n = arr.length; 
		for(int i = 0; i<n-1; i+=2) {
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		return arr[n-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter element: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Single Element: " + singleElement(arr));
	}
	*/
	
	// <<<<< better Option (Using XOR) >>>>>
	/*
	 
	public static int singleElement(int[] arr) {
		int xor = 0; 
		for(int num : arr) {
			xor ^= num; 
		}
		return xor; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter sorted array: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Single element: "+ singleElement(arr));
	}
	*/
	
	// <<< Optimal way (Binary Search) >>>>
	
	public static int singleElement(int[] arr) {
		int n = arr.length; 
		
		if(n==1)
			return arr[0];
		
		if(arr[0] != arr[1])
			return arr[0];
		
		if(arr[n-1] != arr[n-2]) {
			return arr[n-1];
		}
		
		int low = 1; 
		int high = n-2; 
		
		while(low <= high) {
			int mid = low + (high-low)/2;
		}
		return -1; 
	}

}
