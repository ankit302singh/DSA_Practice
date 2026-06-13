package arrayEasy;

public class Max_Product_SubArray {
	/*
// ======== Approach 1st ==============
	public static int maxProduct(int[] arr) {
		int maxProduct = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			int product = 1; 
			
			for(int j =i; j<arr.length; j++) {
				product *= arr[j];
				maxProduct = Math.max(maxProduct,product);
				
			}
		}
		return maxProduct; 
	}
	public static void main(String[] args) {
		int[] arr = {2,3,-2,4}; 
		System.out.println("MaxProduct = "+ maxProduct(arr));
	}
      */
	
// ===== optimal approach ===========
	public static int maxProduct(int[] arr) {
		int maxEnding = arr[0];
		int minEnding = arr[0];
		int answer = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			
			if(current < 0) {
				int temp = maxEnding; 
				maxEnding = minEnding; 
				minEnding = temp ; 
			}
			maxEnding = Math.max(current, maxEnding * current);
			minEnding = Math.min(current, minEnding * current);
			answer = Math.max(answer, maxEnding);
		}
		return answer; 
	}
	public static void main(String[] args) {
		int[] arr = {2,3,-2,4}; 
		System.out.println("MaxProduct = "+ maxProduct(arr));
	}
}
