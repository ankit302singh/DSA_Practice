package Binary_Search;
import java.util.Scanner;

public class Square_Root_of_Number {
     public static int squareRoot(int n) {
    	 int ans = 0; 
    	 for(int i=1; i<=n; i++) {
    		 if((long)i * i <= n) {
    			 ans = i; 
    		 }
    		 else {
    			 break; 
    		 }
    	 }
    	 return ans; 
     }
}
