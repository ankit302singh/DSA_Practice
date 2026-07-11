package Binary_Search;
import java.util.Scanner;
public class First_and_Last_Occurrences_in_Array {
	// <<< Via Linear Search >>>> 
	/*
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the Sorted Array elements: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element to search: ");
		int x = sc.nextInt();
		
		int first = -1; 
		int last = -1; 
		
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				if(first == -1) {
					first = i; 
				}
				last = i;
			}
		}
		System.out.println("First Occurrence: "+first);
		System.out.println("Second Occurrence: "+ last);
	}
	 */
	
	// <<<<<< Better Way ( Two Linear Search ) >>>>>>>>>>
	// for 1st Occurrence = search from left 
	// for 2nd = search from last 
	
/*	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter Sorted Array: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter targe: ");
		int x = sc.nextInt();
		
		int first = -1; 
		int last = -1; 
		
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				first = i; 
				break;
			}
		}
		for(int i=n-1; i>=0; i--) {
			if(arr[i] == x) {
				last = i; 
				break; 
			}
		}
		System.out.println("First Occurrence: "+ first);
		System.out.println("Second Occurrence: "+ last);
	}
	*/
	
	// <<<<<< Optimal way (Binary Search) >>>>>>>
	// Function for First Occurrence 
	
	static int firstOccurrence(int[]arr, int x) {
		int low = 0; 
		int high = arr.length - 1; 
		int ans = -1; 
		
		while(low <= high) {
			int mid = low + (high-low)/2 ;
			if(arr[mid] == x) {
				ans = mid ; 
				high = mid - 1; 
			}
			else if(arr[mid] < x) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		 return ans ; 
	}
	
	// Function for Last Occurrence 
	
	static int lastOccurrence(int[] arr, int x) {
		int low = 0; 
		int high = arr.length-1; 
		int ans = -1; 
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == x) {
				ans = mid ; 
				low = mid + 1; 
			}
			else if(arr[mid] < x) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		return ans; 
	}
	public static void main(String[] args) {
		
	}

}
