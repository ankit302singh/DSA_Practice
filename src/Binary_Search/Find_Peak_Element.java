package Binary_Search;

public class Find_Peak_Element {
	public static int findPeak(int[] arr) {
		int n = arr.length; 
		
		if(n==1)
			return 0; 
		
		if(arr[0] >= arr[1])
			return 0; 
		
		for(int i =1; i<n; i++) {
			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
				return i; 
			}
		}
		return -1; 
	}

}
