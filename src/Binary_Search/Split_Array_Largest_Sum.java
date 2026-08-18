package Binary_Search;

import java.util.Scanner;

public class Split_Array_Largest_Sum {
	/*
	static boolean canSplit(int[] arr, int k, int maxSum) {
		
		int subarrays = 0; 
		int currentSum = 0; 
		
		for(int num : arr) {
			if(currentSum + num <= maxSum) {
				currentSum += num; 
			}
			else {
				subarrays++; 
				currentSum = num; 
			}
		}
		return subarrays <= k; 
	}
	static int splitArray(int[] arr, int k) {
		int maxElement = 0; 
		int totalSum = 0; 
		
		for(int num : arr) {
			maxElement = Math.max(maxElement, num);
			totalSum += num; 
		}
		for(int maxSum = maxElement; maxSum <= totalSum; maxSum++) {
			if(canSplit(arr, k, maxSum)) {
				return maxSum;
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int answer = splitArray(arr, k);
		System.out.println(answer);
		
		sc.close();
	}
	*/
	
	static int countSubarrays(int[] arr, long maxSum) {
		int subarrays = 1; 
		long currentSum = 0; 
		
		for(int num : arr) {
			if(currentSum + num <= maxSum) {
				currentSum += num ; 
			}
			else {
				subarrays++; 
				currentSum = num; 
			}
		}
		return subarrays; 
	}
	static long splitArray(int[] arr, int k) {
		long low = 0; 
		long high = 0; 
		
		for(int num : arr) {
			low = Math.max(low, num);
			high += num; 
		}
		while(low <= high) {
			
		}
	}
   
}
