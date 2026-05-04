package arrayEasy;
import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
       
		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0; 
		
		for(int num : arr) {
			result ^= num; 
		}
		System.out.println("number that apper once is: "+ result);
		
		sc.close();
	}

}
