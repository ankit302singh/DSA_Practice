package Binary_Search;
import java.util.Scanner;

public class Search_in_rotated_sorted_array1 { 
	// <<<<< Vai Linear Search >>>>>
	/*
	public static int search(int[]arr, int target) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == target) {
				return i; 
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array element: ");
		
		for(int i =0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target = sc.nextInt();
		
		int ans = search(arr, target);
		System.out.println("Target fount at: " + ans);
	}
	
	*/
    // <<< Better Way (find Pivot then Binary Search ) >>>
	/*
	
	public static int findPivot(int[] arr) {
		int low = 0; 
		int high = arr.length - 1; 
		while(low < high) {
			int mid = low + (high - low)/2; 
			if(arr[mid] > arr[high]) {
				low = mid + 1; 
			}
			else {
				high = mid; 
			}
		}
		return low; 
	}
	public static int binarySearch(int[] arr, int low, int high, int target) {
		while(low <= high) {
			int mid = low + (high - low)/2; 
			
			if(arr[mid] == target)
				return mid; 
			
			else if(arr[mid] < target)
				low = mid + 1; 
			
			else 
				high = mid - 1; 
		}
		 return -1; 
	}
	
	public static int search(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		if(target >= arr[pivot] && target <= arr[arr.length - 1]) {
			return binarySearch(arr, pivot, arr.length -1, target);
		}
		return binarySearch(arr, 0, pivot -1, target);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array: ");
		
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
			
			System.out.print("enter target: ");
			int target = sc.nextInt();
			
			System.out.println("Index: " + search(arr, target));
		}
	}
	*/
	// <<<<< Optimal way ( via single binary search ) >>>>>>>>
	
	public static int search(int[] arr, int target) {
		int low = 0; 
		int high = arr.length - 1; 
		
		while(low <= high) {
			int mid = low + (high - low)/2 ; 
			if(arr[mid] == target) {
				return mid; 
			}
			// left half is sorted 
			if(arr[low] <= arr[mid]) {
				// target lies inside left half
				if(target >= arr[low] && target < arr[mid]) {
					high = mid - 1; 
				}
				else {
					low = mid + 1; 
				}
			}
			else {
				if(target > arr[mid] && target <= arr[high]) {
					low = mid + 1; 
				}
				else {
					high = mid - 1; 
				}
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
}
