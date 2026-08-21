package Binary_Search;
import java.util.*;

public class Minimize_max_distance_to_Gas_Station {
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
	}

}
