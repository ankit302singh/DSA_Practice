package Binary_Search;

public class Find_row_with_maximum_1s {
	public static int findMaxOnes(int[][] matrix) {
		int maxOnes = 0; 
		int rowIndex = -1; 
		
		for(int i=0; i<matrix.length; i++) {
			int count = 0; 
			
			for(int j =0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1) {
					count++; 
				}
			}
			if(count > maxOnes) {
				
			}
		}
	}

}
