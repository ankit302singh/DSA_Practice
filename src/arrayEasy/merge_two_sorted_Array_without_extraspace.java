package arrayEasy;
import java.util.*;

// ======= Better Approach (Swap + Sort ) ========

public class merge_two_sorted_Array_without_extraspace {
	
	/*
	public static void merge(int[] arr1, int[]arr2, int n, int m) {
		int left = n-1; 
		int right = 0;
		
		while(left >=0 && right < m) {
			if(arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				
				left--;
				right++;
			}
			else {
				break ; 
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
	public static void main(String[] args) {
		int[] arr1 = {1,4,8,10};
		int[] arr2 = {2, 3, 9};
		
		merge(arr1, arr2, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
  */

// ===== Optimal Approach ( Gap Method / Shell Sort method ) 
     public static int nextGap(int gap) {
    	 if(gap <= 1)
    		 return 0 ;
    	 
    	 return (gap / 2) + (gap % 2);
     }
     public static void merge(int[] arr1, int[] arr2, int n, int m) {
    	 int len = n + m; 
    	 int gap = nextGap(len);
    	 
    	 while(gap > 0) {
    		 int left = 0; 
    		 int right = left + gap; 
    		 
    		 while(right < len) {
    			 // both in arr1 
    			 if(left < n && right < n) {
    				 if(arr1[left] > arr1[right]) {
    					 int temp = arr1[left];
    					 arr1[left] =   arr1[right];
    					 arr1[right] = temp; 
    				 }
    			 }
    			 // left in arr1, right in arr2 
    			 else if(left < n && right >= n) {
    				 if(arr1[left] > arr2[right - n]) {
    					 int temp = arr1[left];
    					 arr1[left] = arr2[right - n];
    					 arr2[right - n] = temp;
    				 }
    			 }
    			 // both in arr2 
    			 else {
    				 if(arr2[left - n] > arr2[right - n]) {
    					 int temp = arr2[left - n];
    					 arr2[left - n] = arr2[right - n];
    					 arr2[right - n] = temp ; 
    				 }
    			 }
    			 left++; 
    			 right++; 
    		 }
    		 gap = nextGap(gap);
    	 }
     }
     public static void main(String[] args) {
    	 int[] arr1 = {1,4,8,10};
    	 int[] arr2 = {2,3,9};
    	 
    	 merge(arr1, arr2, arr1.length, arr2.length);
    	 
    	 System.out.println(Arrays.toString(arr1));
    	 System.out.println(Arrays.toString(arr2));
     }
}
