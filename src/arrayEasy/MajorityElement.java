// MAJORITY ELEMENT FOR N/2 
package arrayEasy;
import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FIRST BRUTE APPROACH 
		
		int[] arr = {2,2,1,1,2,2,2}; 
		// int n = arr.length; 
		/*
		for(int i=0; i<n; i++) {
			int count =0; 
			
			for(int j=0; j<n; j++) {
				if(arr[j] == arr[i]) {
					count++; 
				}
			}
			if(count > n/2) {
				System.out.println(arr[i]);
				return ; 
			}
		}
		*/
		
		//SECOND BETTER APPROACH USING HASHMAP 
		/*
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
			if(map.get(num) > n/2) {
				System.out.println(num);
				return ; 
			}
		}
		*/
		//OPTIMAL APPROACH (MOORE'S VOTING ALOGRITHM 
       
		int candidate = 0; 
		int count = 0; 
		
		for(int num : arr) {
			if(count == 0) {
				candidate = num; 
			}
			if(num == candidate) {
				count++; 
			} else {
				count--;
			}
		}
		count = 0; 
		for(int num : arr) {
			if(num == candidate) {
				count++; 
			}
		}
		if(count > arr.length / 2) {
			System.out.println("Majority element: "+candidate);
		}
	}

}
