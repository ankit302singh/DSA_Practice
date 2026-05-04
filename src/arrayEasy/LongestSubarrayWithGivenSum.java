package arrayEasy;
import java.util.*;
import java.util.Scanner;

public class LongestSubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element: ");
		int n= sc.nextInt();
		
		int[] arr = new int[n];
        System.out.println("Enter element:");
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();     
       	}
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum =0; 
        int maxLen = 0; 
        
        for(int i=0; i<n; i++) {
        	prefixSum += arr[i];
        	
        	if(prefixSum == k) {
        		maxLen = i+1; 
        	}
        	if(map.containsKey(prefixSum - k)) {
        		int prevIndex = map.get(prefixSum - k);
        		maxLen = Math.max(maxLen, i-prevIndex);
        	}
        	map.putIfAbsent(prefixSum, i);
        }
        System.out.println("Longest Subarray Length = "+ maxLen);
        sc.close();
	}
	

}
