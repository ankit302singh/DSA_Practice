package Binary_Search;

public class Upper_Bound {
	/*
   public static int upperBound(int[] arr, int x) {
	   for(int i=0; i<arr.length; i++) {
		   if(arr[i] > x) {
			   return i;
		   }
	   }
	   return arr.length; 
   }
   public static void main(String[] args) {
	   int[] arr = {1,2,4,4,5,7};
	   int x = 4; 
	   System.out.println("Upper_Bound = "+ upperBound(arr,x));
   }
   */
	
// ==== Optimal Approach ==========
	public static int upperBound(int[] arr, int x) {
		int low = 0; 
		int high = arr.length-1; 
		
		int ans = arr.length; 
		while(low <= high) {
		   int mid = low + (high-low)/2;
		   if(arr[mid] > x) {
			   ans = mid; 
			   high = mid - 1; 
		   }
		   else {
			   low = mid + 1; 
		   }
		}
		return ans; 
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,4,5,7}; 
		int x = 4; 
		System.out.println("Upper Bound = "+ upperBound(arr,x));
	}
}
