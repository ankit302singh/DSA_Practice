package arrayEasy;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByKplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		System.out.println("Enter elements:");
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter D(no. of rotations):");
		int D = sc.nextInt();
		
		D = D % N ; 
		
		// first D elements 
		reverse(arr, 0, D-1);
		
		//remaining N-D elements
		reverse(arr, D, N-1);
		
		// entire 
		reverse(arr, 0, N-1);
		
		System.out.println("After rotation: "+ Arrays.toString(arr));

	}
	private static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp; 
			start++; 
			end--; 
		}
	}

}
