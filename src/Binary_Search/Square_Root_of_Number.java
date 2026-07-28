package Binary_Search;
import java.util.Scanner;

public class Square_Root_of_Number {
	/*
     public static int squareRoot(int n) {
    	 int ans = 0; 
    	 for(int i=1; i<=n; i++) {
    		 if((long)i * i <= n) {
    			 ans = i; 
    		 }
    		 else {
    			 break; 
    		 }
    	 }
    	 return ans; 
     }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("Enter Number: ");
    	 int n = sc.nextInt();
    	 
    	 System.out.println("Square root: " + squareRoot(n));
    	 
    	 sc.close();
    	
     }
     */
	// <<< better way (Binary Search) >>>
	
	public static int squareRoot(int n) {
		int low = 1; 
		int high = n; 
		int ans = 0; 
		while (low <= high) {
			int mid = low + (high - low )/ 2; 
			long square = (long) mid * mid ; 
			
			if(square == n) {
				return mid; 
			}
			else if(square < n) {
				ans = mid ; 
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		return ans; 
	}
}
