package Binary_Search;

public class Find_the_Smallest_Divsior_Given_Tharshold {
	/*
     public static int smallestDivisor(int[] nums, int threshold) {
    	 
    	 int max = nums[0];
    	 for(int num : nums) {
    		 if(num > max)
    			 max = num ; 
    	 }
    	 
    	 for(int divisor = 1; divisor <= max; divisor++) {
    		 int sum = 0; 
    		 
    		 for(int num : nums) {
    			 
    			 sum += (num + divisor -1) / divisor; 
    		 }
    		 if(sum <= threshold)
    			 return divisor; 
    	 }
    	 return -1; 
     }
     
     public static void main(String[] args) {
    	 int[] nums = {1,2,5,9};
    	 int threshold = 6; 
    	 
    	 System.out.println("smalles_divisor: " + smallestDivisor(nums,threshold));
     }
     */
	// <<<< Optimal way (Binary Search) >>>>
	
	static int calculateSum(int[] nums, int divisor) {
		int sum = 0; 
		
		for(int num : nums) {
			sum += (num + divisor -1)/divisor ; 
		}
		
		return sum; 
	}
	
	public static int smallesDivisor(int[] nums, int threshold) {
		
		int max = nums[0];
		
		for(int num : nums) {
			if(num > max)
				max = num; 
		}
		
		int low = 1; 
		int high = max; 
		int answer = max; 
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			int sum = calculateSum(nums, mid);
			
			if(sum <= threshold) {
				answer = mid; 
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		return answer; 
	}
	
}
