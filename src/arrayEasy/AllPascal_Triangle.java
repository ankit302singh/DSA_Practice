//GIVEN N PRINT THE ENTIRE PASCAL TRIANGLE
package arrayEasy;
import java.util.*;

public class AllPascal_Triangle {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter N: ");
	   int n = sc.nextInt();
	   
	   for(int i=0; i<n; i++) {
		   int res = 1; 
		   
		   for(int j=0; j<=i; j++) {
			   System.out.print(res+" ");
			   
			   res = res * (i-j) / (j+1);
		   }
		   System.out.println();
	   }
   }
}
