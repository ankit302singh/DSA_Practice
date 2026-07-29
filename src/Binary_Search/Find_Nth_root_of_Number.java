package Binary_Search;

public class Find_Nth_root_of_Number {
	public static long power(int base, int exponent) {
		long result = 1; 
		
		for(int i = 1; i <= exponent; i++) {
			result *= base; 
		}
		return result; 
	}
	public static void nthRoot(int n, int m) {
		for(int i = 1; i <= m; i++) {
			long value = power(i, n);
			
			
		}
	}

}
