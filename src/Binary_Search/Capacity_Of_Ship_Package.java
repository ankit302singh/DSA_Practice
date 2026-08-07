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

}
	
