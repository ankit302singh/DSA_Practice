package Binary_Search;
import java.util.Scanner;
public class First_and_Last_Occurrences_in_Array {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the Sorted Array elements: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element to search: ");
		int x = sc.nextInt();
		
		int first = -1; 
		int last = -1; 
		
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				if(first == -1) {
					first = i; 
				}
				last = i;
			}
		}
		System.out.println("First Occurrence: "+first);
		System.out.println("Second Occurrence: "+ last);
	}

}
