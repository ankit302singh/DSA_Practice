package Binary_Search;

public class KoKo_Eating_Banana {
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
}
