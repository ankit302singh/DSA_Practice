package arrayEasy;
import java.util.Scanner; 

public class FinetheMissinNumber {
	public static int findMissing(int[] arr) {
		int n = arr.length; 
		int xorAll =0; 
		
		for(int i=1; i<n+1; i++) {
			xorAll ^= i; 
		}
		for(int value : arr) {
			xorAll ^= value; 
		}
		return xorAll ; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("enter" + n + "elements:");
		
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		int result = findMissing(arr);
		
		System.out.println("missing number is: " + result);

	}

}
