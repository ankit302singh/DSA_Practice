package Binary_Search;

public class Painters_Partition {
	
	static boolean canPaint(int[] boards, int k , int limit ) {
		
		int painters = 1; 
		int currentSum = 0; 
		
		for(int board : boards) {
			if(board > limit) {
				return false ; 
			}
			if(currentSum + board <= limit) {
				
			}
		}
	}

}
