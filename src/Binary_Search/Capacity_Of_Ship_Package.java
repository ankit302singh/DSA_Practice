package Binary_Search;

public class Capacity_Of_Ship_Package {
	/*
	static int findDays(int[] weights, int capacity) {
		int days = 1; 
		int load = 0; 
		
		for(int weight : weights) {
			
			if(load + weight > capacity) {
			days++; 
			load = weight; 
		}
			else {
				load += weight; 
			}
	}
		return days; 
	}
	
	static int shipWithinDays(int[] weights, int days) {
		
		int max = 0; 
		int sum = 0; 
		
		for(int weight : weights) {
			max = Math.max(max, weight);
			sum += weight; 
		}
		for(int capacity = max; capacity <= sum; capacity++) {
			if(findDays(weights, capacity) <= days)
				return capacity; 
		}
		
		return -1; 
	}
	public static void main(String[] args) {
		int[] weight = {1,2,3,4,5,6,7,8,9,10};
		int days = 5; 
		
		System.out.println("ShipWithinDays: "+ shipWithinDays(weight, days));
	}
	*/
	
	// <<< Optimal Way (Binary Search) >>>
	
	static int findDays(int[] weight, int capacity) {
		int days = 0; 
		
		return days; 
	}

}
	
