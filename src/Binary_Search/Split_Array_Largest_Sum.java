package Binary_Search;

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
		
	}
   
}
