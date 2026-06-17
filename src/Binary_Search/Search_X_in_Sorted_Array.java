package Binary_Search;
import java.util.*;

public class Search_X_in_Sorted_Array {
// ======Normal Way(Liner Search) ===========
	/*
	public static int search(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				return i; 
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12};
		int x = 8; 
		int result = search(arr, x);
		
		System.out.println("Index = " + result);
	}
   */
// ===========Better Approach ( Using Built-in Binary Search) ==========
	/* 
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12}; 
		int x = 8; 
		
		int index = Arrays.binarySearch(arr, x);
		
		System.out.println("Index = " + index);
	}
	*/
	
// ====== Optimal Approach ( Manual Binary Search)==========
	public static int binarySearch(int[] arr, int x) {
		int low = 0; 
		int high = arr.length -1 ; 
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == x) {
				return mid ; 
			}
			else if(arr[mid] < x) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12}; 
		int x = 8; 
		
		int result = binarySearch(arr, x);
		System.out.println("Indec = " + result);
	}
}
