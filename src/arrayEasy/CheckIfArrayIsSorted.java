package arrayEasy;
import java.util.Scanner; 

public class CheckIfArrayIsSorted {
	public static boolean isSorted(int[] arr) {
		if(arr.length <= 1) {
			return true; 
		}
		for(int i=0; i < arr.length -1; i++) {
			if(arr[i] > arr[i+1]) {
				return false; 
			}
		}
		return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + "elements: ");
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(isSorted(arr)) {
			System.out.println("Array is Sorted. "); 
		}
		else {
			System.out.println("Array is not Sorted");
		}
		sc.close();

	}

}
