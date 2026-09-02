package Binary_Search;
import java.util.*;

public class Search_In_2D_Matrix {
	public static boolean searcMatrix(int[][] matrix, int target) {
		
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
				
			}
		}
	}
}
