package arrayEasy;
import java.util.HashMap;

public class Largest_SubarrayWith_SumZero {
	/*
	// ======= 1st Approach Brute Force ========
			
	public static int largestSubarray(int[] arr) {
		int maxLen = 0; 
		
		for(int i =0; i<arr.length; i++) {
			int sum = 0; 
			
			for(int j =i; j<arr.length; j++) {
				sum += arr[j];
				
				if(sum == 0) {
					int len = j - i + 1; 
					maxLen = Math.max(maxLen, len);
				}
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.println("Largest Length: "+ largestSubarray(arr));

	}
	*/
	
//======= 2nd Approach (Using Prefix Sum Array ======
	
/*
	public static int largestSubarray(int[] arr) {
		int n = arr.length; 
		
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		
		for(int i =1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		
		int maxLen = 0; 
		
		for(int i =0; i<n; i++) {
			
			for(int j = i+1; j<n; j++) {
				
				if(prefix[i] == prefix[j]) {
					
					int len = j - i; 
					maxLen = Math.max(maxLen, len);
				}
			}
			
			if(prefix[i] == 0) {
				maxLen = Math.max(maxLen, i+1);
			}
		}
		return maxLen; 
	}
	public static void main(String[] args) {
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		
		System.out.println("largest element: "+ largestSubarray(arr));
	}
	
	*/

// ====== 3rd Approach (Using HashMap) =====
 public static int largestSubarray(int[] arr) {
	 HashMap<Integer, Integer> map = new HashMap<>();
	 
	 int sum = 0; 
	 int maxLen = 0 ; 
	 
	 for(int i =0; i< arr.length; i++) {
		 sum += arr[i];
		 
		 if(sum == 0) {
			 maxLen = i + 1; 
		 }
		 if(map.containsKey(sum)) {
			 int prevIndex = map.get(sum);
			 int len = i - prevIndex;
			 maxLen = Math.max(maxLen, len);
		 }
		 else {
			map.put(sum, i);
		 }
	 }
	 return maxLen; 
 
 }
 public static void main(String[]args) {
	 int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
	 System.out.println("Largest element: "+largestSubarray(arr));
 }
}
