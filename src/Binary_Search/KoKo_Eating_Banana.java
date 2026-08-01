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
     public static void mian(String[] args) {
    	 int[] piles = {3,6,7,11};
    	 
    	 int k = 8; 
    	 
    	 System.out.println("Minimun_Hour : "+ minSpeed(piles,k));
     }
}
