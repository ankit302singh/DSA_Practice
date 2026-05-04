
package arrayEasy;
import java.util.Scanner; 

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		
       int[] arr = new int[n];
       System.out.println("Enter elements:");
       for(int i=0; i<n; i++) {
    	   arr[i] = sc.nextInt();
       }
       int pos = 0; 
       
       for(int i=0; i< n; i++) {
    	   if(arr[i] != 0) {
    		   arr[pos] = arr[i];
    		   pos++; 
    	   }
       }
       while(pos < n) {
    	   arr[pos] = 0; 
    	   pos++; 
       }
       System.out.println("Array after moving zeros: ");
       for(int num : arr) {
    	   System.out.print(num + " ");
       }
       sc.close();
	}

}
