package Binary_Search;

import java.util.Scanner;

public class Split_Array_Largest_Sum {
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
	}
   
}
