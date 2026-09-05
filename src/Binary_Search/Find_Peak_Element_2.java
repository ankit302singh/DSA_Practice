package Binary_Search;

public class Find_Peak_Element_2 {
	// <<< Brute Force >>>
	// *** check every element ***
	public static int[] findPeakGrid(int[][] mat) {
		
		int rows = mat.length; 
		int cols = mat[0].length;
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < cols; j++) {
				
				int current = mat[i][j];
				
				int top = (i > 0) ? mat[i-1][j] : -1; 
			}
		}
		return new int[] {-1,-1};
	}

}
