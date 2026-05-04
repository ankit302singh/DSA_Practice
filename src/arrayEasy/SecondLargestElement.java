package arrayEasy;
import java.util.Scanner; 

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1: Take input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        // step 2: Initialize largest and 2nd largest
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
        
        // step 3: Pass 
        for(int i=0; i<n; i++) {
        	if(arr[i]>largest) {
        		secondLargest = largest; 
        		largest = arr[i];
        	}
        	else if(arr[i] > secondLargest && arr[i] != largest) {
        		secondLargest = arr[i];
        	}
        }
        
        //step 4: output 
        if(secondLargest == Integer.MIN_VALUE) {
        	System.out.println("No 2nd largest element found");
        }
        else {
        	System.out.println("2nd Largest element is: " + secondLargest);
        }
        sc.close();
	}

}
