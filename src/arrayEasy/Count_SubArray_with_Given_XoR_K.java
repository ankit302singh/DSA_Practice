package arrayEasy;
import java.util.*; 

public class Count_SubArray_with_Given_XoR_K {
	/*
  // ==== BRUTE FORCE =======
	public static int countSubarrays(int[] arr, int k) {
		int n = arr.length; 
		int count = 0; 
		
		for(int i = 0; i<n; i++) {
			int xor = 0; 
			for(int j = i; j< n; j++) {
				xor = xor ^ arr[j];
				
				if(xor == k) {
					count++; 
				}
			}
		}
		return count ; 
	}
	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 4, 6}; 
		int k = 6; 
		
		int ans = countSubarrays(arr, k);
		
		System.out.println("Count = "+ ans);
	} 
	*/
	
	// ==== OPTIMAL WAY ==========
	public static int countSubarrays(int[] arr, int k ) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int xr = 0; 
		int count = 0; 
		
		map.put(0,1);
		for(int i = 0; i < arr.length; i++) {
			xr = xr ^ arr[i];
			
		    int x = xr ^ k ; 
		    
		    if(map.containsKey(x)) {
		    	count += map.get(x);
		    }
		    map.put(xr,map.getOrDefault(xr,0)+1);
		}
		return count; 
	}
		public static void main(String[] args) {
			int[] arr = { 4, 2, 2, 4, 6}; 
			int k = 6; 
			System.out.println("count: "+ countSubarrays(arr, k));
		}
}
