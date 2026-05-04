package arrayEasy;
import java.util.Scanner; 

public class MinimunConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter elements (only o or 1): ");
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		
		int count =0; 
		int min = Integer.MAX_VALUE; 
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				count++; 
			}
			else {
				if(count > 0 && count < min) {
					min =count; 
				}
				count =0; 
			}
		}
		if(count >0 && count <min) {
			min = count; 
		}
		if(min == Integer.MAX_VALUE) {
			System.out.println("No consecutive found: ");
		}
		else {
			System.out.println("minimun consecutive is: " +min);
		}
		sc.close();

	}

}
