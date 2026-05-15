package arrayEasy;
import java.util.*;

public class Three_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,0,1,2,-1,-4}; 
		int n = arr.length;
/*		
		//1. BRUTE FORCE(NORMAL WAY)
// --FOR AVOID DUPLICATE TRIPLETS--
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k = j+1; k<n; k++) {
		//check if sum is 0
					if(arr[i] + arr[j] + arr[k] == 0) {
						int[] temp = {arr[i],arr[j],arr[k]};
						
						Arrays.sort(temp);
						
						String triplet = temp[0]+" "+temp[1]+" "+temp[2];
						
						set.add(triplet);
					}
				}
			}
		}
		for(String s : set) {
			System.out.println(s);
		}
	*/
		
// 2. BETTER APPROACH (USING HASHSET)
//Fix First element use HashSet to find remaining two numbers
		/*
		Set<List<Integer>> ans = new HashSet<>();
		for(int i=0; i<n; i++) {
			HashSet<Integer> set = new HashSet<>();
			
			for(int j=i+1; j<n; j++) {
				
				int third = -(arr[i] + arr[j]);
				
				if(set.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
					Collections.sort(temp);
					ans.add(temp);
				}
				set.add(arr[j]);
			}
		}
		
		for(List<Integer> list : ans) {
			System.out.println(list);
		}
	*/
		
// 3. OPTIMAL (TWO POINTER)
// SORT ARRAY -> Fix one element -> Use two pointers
		
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			if(i > 0 && arr[i] == arr[i-1]) {
				continue; 
			}
			int left = i+1; 
			int right = n-1; 
			
			while(left < right) {
				int sum = arr[i]+arr[left]+arr[right];
				
				if(sum == 0) {
					ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
					left++; 
					right--; 
					
			// skip duplicate left values 
					while(left < right && arr[left] == arr[left - 1]) {
						left++; 
					}
			// skip duplicate right value 
					while(left < right && arr[right] == arr[right + 1]) {
						right --; 
					}
				}
				
				else if(sum < 0) {
					left++; 
				}
				else {
					right--; 
				}
			
			}
		}

	for(List<Integer> list:ans) {
		System.out.println(list);
	}
	}

}
