package Binary_Search;
import java.util.Scanner;

public class Find_Nth_root_of_Number {
	public static long power(int base, int exponent) {
		long result = 1; 
		
		for(int i = 1; i <= exponent; i++) {
			result *= base; 
		}
		return result; 
	}
	public static int nthRoot(int n, int m) {
		for(int i = 1; i <= m; i++) {
			long value = power(i, n);
			
			if(value == m) {
				return i; 
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

}
