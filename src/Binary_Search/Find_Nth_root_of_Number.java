package Binary_Search;
import java.util.Scanner;

public class Find_Nth_root_of_Number {
	/*
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
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		System.out.print("Enter number; ");
		int m = sc.nextInt();
		
		System.out.println("Nth Root: " + nthRoot(n,m));
		sc.close();
	}
    */
	
	// <<<< Better Way ( Using Math.pow ) >>>> 
	/*
	public static int nthRoot(int n, int m) {
		int root = (int) Math.round(Math.pow(m, 1.0/n));
		
		if(Math.pow(root, n) == m) {
			return root; 
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		System.out.print("Enter Number: ");
		int m = sc.nextInt();
		
		System.out.println("Nth Root: " + nthRoot(n,m));
		
		sc.close();
	}
	*/
	
	// <<<< Optimal Way (Binary Search ) >>>>
	
	public static long power(int base, int exponent) {
		long result = 1; 
		
		for(int i = 1; i <= exponent; i++) {
			result *= base ; 
			
			if(result > Integer.MAX_VALUE) {
				return result; 
			}
		}
		return result; 
	}
	public static int nthRoot(int n, int m) {
		
		return -1; 
	}
}
