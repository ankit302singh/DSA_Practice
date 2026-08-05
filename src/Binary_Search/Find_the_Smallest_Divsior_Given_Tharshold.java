package Binary_Search;

public class Find_the_Smallest_Divsior_Given_Tharshold {
     public static int smallestDivisor(int[] nums, int threshold) {
    	 
    	 int max = nums[0];
    	 for(int num : nums) {
    		 if(num > max)
    			 max = num ; 
    	 }
    	 return -1; 
     }
}
