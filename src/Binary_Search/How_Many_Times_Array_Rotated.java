package Binary_Search;
import java.util.Scanner; 

public class How_Many_Times_Array_Rotated {
	public static int countRotations(int[] arr) {
		int min = arr[0];
		int index = 0 ; 
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				index = i; 
			}
		}
		return index; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array: ");
		
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is rotated: " + countRotations(arr) + " times.");
	}

}
