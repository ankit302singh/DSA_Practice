// MAJORITY ELEMENT FOR N/3 
package arrayEasy;
import java.util.*;

public class MajorityElementN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. BRUTE FORCE (NORMAL WAY) 
		int[] arr = {3,2,3,2,2,1}; 
		int n = arr.length; 
		/*
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int count = 0; 
			for(int j=0; j<n; j++) {
				if(arr[j] == arr[i]) {
					count++; 
				}
			}
			if(count > n/3) {
				if(!result.contains(arr[i])) {
					result.add(arr[i]);
				}
			}
		}
		System.out.println(result);
   */
		//2.BETTER APPROACH (USING HASHMAP)
		/*
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1); 
		}
		List<Integer> result = new ArrayList<>();
		
		for(int key : map.keySet()) {
			if(map.get(key) > n/3) {
				result.add(key);
			}
		}
		System.out.println(result);
		*/
		
		//3. OPTIMAL APPROACH (MOORE VOTING ALGORITHM)
		
		int count1 = 0, count2 = 0; 
		int candidate1 = 0, candidate2 = 1; 
		for(int num : arr) {
			if(num == candidate1) {
				count1++; 
			}
			else if(num == candidate2) {
				count2++; 
			}
			else if(count1 == 0) {
				candidate1 = num; 
				count1 = 1; 
			}
			else if(count2 == 0) {
				candidate2 = num;
				count2 = 1; 
			}
			else {
				count1 --; 
				count2-- ; 
			}
		}
		count1 = 0; 
		count2 = 0; 
		
		for(int num : arr) {
			if(num == candidate1) count1++;
			else if(num == candidate2) count2++; 
		}
		List<Integer> result = new ArrayList<>();
		
		if(count1 > n/3) result.add(candidate1);
		if(count2 > n/3) result.add(candidate2);
		
		System.out.println(result);
	}

}
