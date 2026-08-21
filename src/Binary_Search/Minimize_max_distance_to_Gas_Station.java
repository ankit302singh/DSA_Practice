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
				double originealGap = arr[i+1] - arr[i];
			}
		}
	}

}
