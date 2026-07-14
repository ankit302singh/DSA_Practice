package Binary_Search;
import java.util.Scanner;

// <<<<<< Normal Way (Linear Search) >>>>>>>


public class Count_Occurrence {
	/*
	 * 
	public static int countOccurrence(int[] arr, int x) {
		int count = 0; 
		for(int num : arr) {
			if(num == x) {
				count++; 
			}
		}
		return count; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter sorted array: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("enter element to search: ");
		int x = sc.nextInt();
		int ans = countOccurrence(arr,x);
		System.out.println("Occurrence: " + ans);
	}
	*/
	
	// <<<<<  Better Way (Binary Search + Expand Left & Right) >>>>
    /*    
	public static int countOccurrence(int[] arr, int x) {
		int low = 0; 
		int high = arr.length - 1; 
		int index = -1; 
		
		while(low <= high) {
			int mid = low + (high - low)/2 ; 
			
			if(arr[mid] == x) {
				index = mid ; 
				break ; 
			}
			else if(arr[mid] < x) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		if(index == -1)
			return 0 ; 
			
			int count = 1; 
			int left  = index - 1; 
			while(left >= 0 && arr[left] == x) {
				count++; 
				left--; 
			}
			int right = index - 1; 
			while(right < arr.length && arr[right] == x) {
				count++; 
				right++; 
			}
			return count; 
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter sorted Array: ");
		for(int i= 0; i<n; i++) {
			arr[i] = sc.nextInt();
			
			System.out.print("enter element: ");
			int x = sc.nextInt();
			
			System.out.println("Occurrence: " + countOccurrence(arr,x));
		}
	}
	*/
	
	// <<<< Optimal way (First + Last Occurrence) >>>>>
	
	public static int firstOccurrence(int[] arr, int x) {
		int low = 0; 
		int high = arr.length - 1 ; 
		int ans = -1; 
		while(low <= high) {
			int mid = low + (high - low)/2 ; 
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
		return ans; 
	}
	
	public static int lastOccurrence(int[]arr, int x) {
		int low = 0; 
		int high = arr.length -1; 
		int ans = -1; 
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid]==x) {
				ans = mid; 
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
	public static int countOccurrence(int[]arr, int x) {
		int first = firstOccurrence(arr,x);
		if(first == -1)
			return 0; 
		
		int last = lastOccurrence(arr, x);
		return last - first + 1; 
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter sorted array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
			System.out.println("enter element: ");
			int x = sc.nextInt();
			
			System.out.println("Occurrence: " + countOccurrence(arr, x));
		}
		
	}
}
