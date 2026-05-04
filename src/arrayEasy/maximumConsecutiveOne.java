package arrayEasy;
import java.util.Scanner;

public class maximumConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the element(only 0 or 1): ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
		}
		int count =0; 
		int max =0; 
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				count++ ; 
				if(count > max) {
					max = count; 
				}
			}
			else {
				count =0 ; 
			}
		}
		System.out.println("Maxmium consecutive is: "+max);
           sc.close();
	}

}
