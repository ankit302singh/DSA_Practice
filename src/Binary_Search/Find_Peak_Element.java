package Binary_Search;
import java.util.Scanner; 

public class Find_Peak_Element {
	/*
	public static int findPeak(int[] arr) {
		int n = arr.length; 
		
		if(n==1)
			return 0; 
		
		if(arr[0] >= arr[1])
			return 0; 
		
		for(int i =1; i<n; i++) {
			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
				return i; 
			}
		}
		if(arr[n-1] >= arr[n-2])
			return n-1; 
		return -1; 
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter element: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int index = findPeak(arr);
		
		System.out.println("Peak Index: " + index);
		System.out.println("Peak element: " + arr[index]);
		
	}
	*/
	// <<<< Better Approach >>>>
	public static int findPeak(int[] arr) {
		int n = arr.length; 
		for(int i=0; i<n; i++) {
			
			boolean left = (i==0) || arr[i] >= arr[i-1];
			boolean right = (i == n-1) || arr[i] >= arr[i+1];
			
			if(left && right)
				return i; 
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Element: ");
	}

}
