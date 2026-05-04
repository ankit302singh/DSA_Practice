// GIVEN ROW AND COLUMN FIND THE ELEMENT AT THAT POSITION ON PASCAL TRIANGLE

package arrayEasy;
import java.util.*;

public class Pascal_Triangle {
         public static int nCr(int n, int r) {
        	 int res = 1; 
        	 
        	 for(int i=0; i<r; i++) {
        		 res = res * (n-i);
        		 res = res / (i+1);
        	 }
        	 return res; 
         }
         public static void main(String[]args) {
        	 Scanner sc = new Scanner(System.in);
        	 
        	 System.out.print("Enter row: ");
        	 int row = sc.nextInt();
        	 
        	 System.out.print("Enter column: ");
        	 int col = sc.nextInt();
        	 
        	 int n = row -1; 
        	 int r = col -1; 
        	 
        	 int result = nCr(n,r);
        	 
        	 System.out.println("Element at position: "+ result);
         }
}


