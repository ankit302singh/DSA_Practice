package Binary_Search;

public class KoKo_Eating_Banana {
	/*
     public static int minSpeed(int[] piles, int k) {
    	 int max = piles[0];
    	 for(int pile : piles) {
    		 if(pile > max)
    			 max = pile; 
    	 }
    	 
    	 for(int speed = 1; speed <= max; speed++) {
    		 int hours = 0; 
    		 
    		 for(int pile : piles) {
    			 hours += (pile + speed - 1)/ speed;
    		 }
    		 if(hours <= k) {
    			 return speed; 
    		 }
    	 }
    	 return -1; 	
     }
     public static void main(String[] args) {
    	 int[] piles = {3,6,7,11};
    	 
    	 int k = 8; 
    	 
    	 System.out.println("Minimun_Hour : "+ minSpeed(piles,k));
     }
     
	*/
	// <<< Optimal way (Binary Search) >>>
	
	public static int calculateHours(int[] piles, int speed) {
		int totalHours = 0; 
		
		for(int pile : piles) {
			totalHours += (pile + speed - 1) / speed; 
		}
		
		return totalHours; 
	}
	
	
	public static int minEating(int[] piles, int h) {
		
		int max = piles[0];
		
		for(int pile : piles) {
			if(pile > max)
				max = pile; 
		}
		
		int low = 1; 
		int high = max; 
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			int hours = calculateHours(piles, mid);
			
			if(hours <= h) {
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		return low ; 
	}
	
}
