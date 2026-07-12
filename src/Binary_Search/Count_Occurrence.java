package Binary_Search;
import java.util.Scanner;

public class Count_Occurrence {
	public static int countOccurrence(int[] arr, int x) {
		int count = 0; 
		for(int num : arr) {
			if(num == x) {
				count++; 
			}
		}
		return count; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter sorted array: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("enter element to search: ");
		int x = sc.nextInt();
		int ans = countOccurrence(arr,x);
		System.out.println("Occurrence: " + ans);
	}

}
