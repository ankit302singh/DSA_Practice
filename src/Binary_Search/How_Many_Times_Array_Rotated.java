package Binary_Search;
import java.util.Scanner; 

public class How_Many_Times_Array_Rotated {
	/*
	public static int countRotations(int[] arr) {
		int min = arr[0];
		int index = 0 ; 
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				index = i; 
			}
		}
		return index; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array: ");
		
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is rotated: " + countRotations(arr) + " times.");
	}
	*/
	
	// <<<<< Optimal way ( Binary Search) >>>>>
	
	public static int countRotations(int[] arr) {
		int low = 0; 
		int high = arr.length - 1; 
		
		int min = Integer.MIN_VALUE; 
		int index = 0; 
		
		while(low <= high) {
			int mid = low + (high - low) / 2 ; 
			
			if(arr[low] <= arr[mid]) {
				if(arr[low] < min) {
					min = arr[low];
					index = low; 
				}
				low = mid + 1; 
			}
			else {
				if(arr[mid] <= min) {
					min = arr[mid];
					index = mid; 
				}
				high = mid - 1; 
			}
		}
		return index; 
	} 

}
