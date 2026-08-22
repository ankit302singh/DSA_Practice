package Binary_Search;
import java.util.*;

public class Minimize_max_distance_to_Gas_Station {
	/*
	public static double minimizeMaxDistance(int[] arr, int k) {
		int n = arr.length; 
		
		int[] placed = new int[n-1];
		for(int station = 1; station <= k; station++) {
			
			double maxSection = -1; 
			int maxIndex = -1; 
			
			for(int i = 0; i < n-1; i++) {
				double originalGap = arr[i+1] - arr[i];
				
				double sectionLength = originalGap / (placed[i] + 1.0);
				
				if(sectionLength > maxSection) {
					maxSection = sectionLength; 
					maxIndex = i; 
				}
			}
			placed[maxIndex]++; 
		}
		double answer = -1;
	
	for(int i = 0; i < n-1; i++) {
		double originalGap = arr[i+1] - arr[i];
		
		double sectionLength = originalGap / (placed[i] + 1.0);
		
		answer = Math.max(answer, sectionLength);
	}
	return answer; 
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 13, 17, 23}; 
		int k = 5; 
		
		double answer = minimizeMaxDistance(arr,k);
		System.out.println(answer);
		
	}
	*/
	
	// << Optimal Way (binary search) >>
	
	public static int stationRequired(int[] arr, double distance) {
		int count = 0; 
		for(int i = 1; i < arr.length; i++) {
			double gap = arr[i] - arr[i-1];
			
			int station = (int)Math.ceil(gap / distance) - 1; 
			
			count += station; 
		}
		return count; 
	}
	
	public static double minimizeMaxDistance(int[] arr, int k) {
		int n = arr.length; 
		double low = 0.0; 
		double high = 0.0; 
	}

}
