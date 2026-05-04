package arrayEasy;
import java.util.Scanner; 

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt(); 
        
        int[] arr = new int[n];
        
        System.out.println("Enter the Elements:");
        arr[0] = sc.nextInt();
       // assume 1st element is largest 
        int largest = arr[0]; 
        
        for(int i=1; i<n; i++) {
        	arr[i] = sc.nextInt();
        	
        	if(arr[i] > largest) {
        		largest = arr[i];
        	}
        }
        System.out.println("Largest Element: "+ largest);
	}

}
