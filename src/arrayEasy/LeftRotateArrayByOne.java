package arrayEasy;
import java.util.Scanner; 

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.print("Enter Elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = arr[0];
		for(int i=1; i<n; i++) {
			arr[i -1] = arr[i];
		}
		arr[n-1] = first; 
		
		System.out.println("Array after rotation:");
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();

	}

}
