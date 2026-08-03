package Binary_Search;

public class Minimun_Days_To_Make_Bouquets {
	static int countBouquets(int[] bloomDay, int day, int k) {
		int flowers = 0; 
		int bouquets = 0; 
		
		for(int bloom : bloomDay) {
			if(bloom <= day) {
				flowers++ ; 
			}
			else {
				bouquets += flowers / k; 
				flowers = 0; 
			}
		}
		bouquets += flowers / k; 
		return bouquets; 
	}
     static int minDays(int[] bloomDay, int m, int k) {
    	 if((long)m* k > bloomDay.length)
    		 return -1; 
    	 
    	 int min = Integer.MAX_VALUE; 
    	 int max = Integer.MIN_VALUE; 
    	 
    	 for(int day : bloomDay) {
    		 min = Math.min(min, day);
    		 max = Math.max(max, day);
    	 }
    	 
    	 for(int day = min; day <= max; day++) {
    		 
    	 }
    	 return -1; 
     }
}
