package Binary_Search;

public class Find_Peak_Element_2 {
	/*
	// <<< Brute Force >>>
	// *** check every element ***
	public static int[] findPeakGrid(int[][] mat) {
		
		int rows = mat.length; 
		int cols = mat[0].length;
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < cols; j++) {
				
				int current = mat[i][j];
				
				int top = (i > 0) ? mat[i-1][j] : -1; 
				
				int bottom = (i < rows - 1) ? mat[i+1][j] : -1; 
				
				int left = (j > 0) ? mat[i][j-1] : -1; 
				
				int right = (j < cols - 1) ? mat[i][j+1] : -1; 
				
				if(current > top && 
				   current > bottom && 
				   current > left &&
				   current > right) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[][] mat = {
				{1, 4, 3},
				{6, 7, 8},
				{5, 2, 9}
		};
		
		int[] answer = findPeakGrid(mat);
		
		System.out.println("Peak element position: [" + answer[0] + ", "+answer[1]+"]");
	}
	
	*/
	
	/*
	
	// <<< Better Way >>> 
	
	public static int[] findPeakGrid(int[][] mat) {
		
		int rows = mat.length; 
		int cols = mat[0].length; 
		
		int maxValue = mat[0][0];
		
		int maxRow = 0; 
		int maxCol = 0; 
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(mat[i][j] > maxValue) {
					maxValue = mat[i][j];
					maxRow = i; 
					maxCol = j; 
				}
			}
		}
		
		return new int[] {maxRow, maxCol};
	}
	
	public static void main(String[] args) {
		int[][] mat = {
				{1,4,3},
				{6,7,8},
				{5,2,9}
		};
		int[] answer = findPeakGrid(mat);
		
		System.out.println("Peak Element: [" + answer[0] + ", "+ answer[1] +"]");
	}
	
	*/
	
	// <<< Optimal Way (Binary Search) >>> 
	
	public static int findMaxRow(int[][] mat, int col) {
		
		int maxRow = 0; 
		
		for(int i = 1; i < mat.length; i++) {
			if(mat[i][col] > mat[maxRow][col]) {
				maxRow = i; 
			}
		}
		return maxRow; 
	}
	
	public static int[] findPeakGrid(int[][] mat) {
		
		int rows = mat.length; 
		int cols = mat[0].length; 
		
		int low = 0; 
		int high = cols - 1; 
		
		while(low <= high) {
			int mid = low + (high - low) / 2; 
			
			int maxRow = findMaxRow(mat, mid);
			
			int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1; 
			
			int right = (mid + 1 < cols) ? mat[maxRow][mid + 1] : -1; 
			
			int current = mat[maxRow][mid];
			
			if(current > left && current > right) {
				return new int[] {maxRow, mid}; 
			}
			else if(left > current) {
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		return new int[] {-1, -1}; 
	}
	
	public static void main(String[] args) {
		int[][] mat = {
				{1,4,3},
				{6,7,8},
				{5,2,9}
		};
		
		int[] answer = findPeakGrid(mat);
	}

}
