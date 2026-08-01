package Binary_Search;

public class KoKo_Eating_Banana {
     public static int minSpeed(int[] piles, int k) {
    	 int max = piles[0];
    	 for(int pile : piles) {
    		 if(pile > max)
    			 max = pile; 
    	 }
    	 return -1; 
     }
}
