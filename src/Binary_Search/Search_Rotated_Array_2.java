package Binary_Search;
import java.util.Scanner;

public class Search_Rotated_Array_2 {
	/*
	//<<<< Via Linear Search >>>>
	public static boolean search(int[] arr, int target) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == target) {
				return true; 
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array Element: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		boolean ans = search(arr, target);
		
		System.out.println(ans);
		
		sc.close();
	}
	*/ 
	
	// <<<< Better Way >>>
	
	public static boolean search(int[] arr, int target) {
		int low = 0; 
		int high = arr.length - 1; 
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				return true; 
			}
			if(arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low++; 
				high--; 
				continue; 
			}
			if(arr[low] <= arr[mid]) {
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
		return false; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter element: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}

}
