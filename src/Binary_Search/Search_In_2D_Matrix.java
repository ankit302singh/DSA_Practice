package Binary_Search;
import java.util.*;

public class Search_In_2D_Matrix {
	/*
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		for(int i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) {
				
				if(matrix[i][j] == target) {
					return true; 
				}
			}
		}
		return false; 

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter matrix Element: ");
		
		for(int i=0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		boolean result = searchMatrix(matrix, target);
		
		System.out.println("Target found: " + result);
		sc.close();
	}
	*/
	
	// Better Way -- Find the Row + binary Search 
	
	/*
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		int row = matrix.length; 
		int cols = matrix[0].length; 
		
		for(int i = 0; i < row; i++) {
			if(target >= matrix[i][0] && target <= matrix[i][cols - 1]) {
				return binarySearch(matrix[i], target);
			}
		}
		return false; 
	}
	
	public static boolean binarySearch(int[] arr, int target) {
		
		int low = 0; 
		int high = arr.length - 1; 
		
		while(low <= high) {
			int mid = low + (high - low) / 2; 
			
			if(arr[mid] == target) {
				return true; 
			}
			else if(arr[mid] < target) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		return false; 
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		
		System.out.print("Enter number of cols: ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[row][cols];
		
		System.out.println("Enter matrix elements: ");
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter Target: ");
		int target = sc.nextInt();
		
		boolean result = searchMatrix(matrix, target);
		System.out.println("Target found: " + result);
		
		sc.close();
	}
	
	*/
	
	// <<< Optimal Way (Binary Search ) >>> 
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length; 
		int cols = matrix[0].length; 
		
		int low = 0; 
		int high = rows * cols - 1; 
		
		while(low <= high) {
			int mid = low + (high - low ) / 2; 
			
			int row = mid / cols; 
			
			int col = mid % cols; 
			
			int midValue = matrix[row][col];
			
			if(midValue == target) {
				return true; 
			}
			else if(midValue < target) {
				low = mid + 1; 
			}
			else {
				high = mid - 1; 
			}
		}
		return false; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter number of cols: ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter matrix Element: ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		boolean result = searchMatrix(matrix, target);
		
	}
}
