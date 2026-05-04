package arrayEasy;
import java.util.*;

public class Print_NthRow_Of_PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        int res = 1; 
        System.out.print(res + " ");
        
        for(int r = 0 ; r < n; r++) {
        	res = res * (n-r) / (r + 1);
        	System.out.print(res + " ");
        }
	}

}
