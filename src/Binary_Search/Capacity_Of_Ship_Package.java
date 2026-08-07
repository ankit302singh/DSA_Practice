package Binary_Search;

public class Capacity_Of_Ship_Package {
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
			
		}
		
		return -1; 
	}

}
	
