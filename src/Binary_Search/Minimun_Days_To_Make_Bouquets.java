package Binary_Search;

public class Minimun_Days_To_Make_Bouquets {
	/*
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
    		 
    		 if(countBouquets(bloomDay, day, k ) >= m)
    			 return day; 
    	 }
    	 return -1; 
     }
     
     public static void main(String[] args) {
    	 int[] bloomDay = {1,10,3,10,2};
    	 
    	 int m = 3; 
    	 int k = 1; 
    	 
    	 System.out.println("MinDays: "+ minDays(bloomDay,m,k));
     }
     */
	
	// <<< Optimal Way (Binary Search) >>>
	
	static boolean canMake(int[] bloomDay, int day, int m, int k) {
		int flowers = 0; 
		int bouquets = 0; 
		
		for(int bloom : bloomDay) {
			if(bloom <= day) {
				flowers++; 
				
				if(flowers == k) {
					bouquets++; 
					flowers = 0; 
				}
			}
			else {
				flowers = 0; 
			}
		}
		
		return bouquets >= m; 
	}
	static int minDays(int[] bloomDay, int m, int k) {
		if((long) m * k > bloomDay.length)
		 return -1; 
		
		int low = Integer.MAX_VALUE; 
		int high = Integer.MIN_VALUE;
		
		for(int day : bloomDay) {
			low = Math.min(low, day);
			high = Math.max(high, day);
		}
		
		int answer = -1; 
		
		while(low <= high) {
			int mid = low + (high - low)/2; 
			
			if(canMake(bloomDay, mid, m, k)) {
				answer = mid; 
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		
		return answer; 
	}
	public static void main(String[] args) {
		int[] bloomDay = {1,10,3,10,2};
		
		System.out.println("Min_Days: " + minDays(bloomDay,3,1));
	}
}
