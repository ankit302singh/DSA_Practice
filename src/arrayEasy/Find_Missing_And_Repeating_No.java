package arrayEasy;

public class Find_Missing_And_Repeating_No {
/*	
// ===== Approach 1 (Brute Force) ======
	// idea count how many time it appears in the array
	// if count = 2 -> repeating number
	// if count = 0 -> missing number 
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,3};
		int n = arr.length;
		
		int missing = -1; 
		int repeating = -1; 
		
		for(int i=1; i<n ; i++) {
			int count = 0; 
			for(int j=0; j<n; j++) {
				if(arr[j] == i) {
					count++;
				}
			}
			if(count == 2) {
				repeating = i; 
			}
			if(count == 0) {
				missing = i;
			}
		}
		System.out.println("Repeating = " + repeating);
		System.out.println("Missing = " + missing);
	}
	*/
	// === Approach 2: Better Way(Hashing) ====
	// idea : create frequency Array 
	// frequency 2 = repeating 
	// frequency 0 =  missing 
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,3};
		int n = arr.length;
		int[] hash = new int[n+1];
	
		for(int i=0; i<n; i++) {
			hash[arr[i]]++;
		}
		int missing = -1; 
		int repeating = -1; 
		
		for(int i=1; i<=n; i++) {
			if(hash[i] == 0) {
				missing = i; 
			}
			if(hash[i] == 2) {
				repeating = i;
			}
		}
		System.out.println("Repeating = " + repeating);
		System.out.println("Missing = " + missing);
	}
}
