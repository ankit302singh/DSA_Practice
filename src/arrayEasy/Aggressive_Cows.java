package arrayEasy;
import java.util.*;

import java.util.Arrays;

public class Aggressive_Cows {
	static int maxDistance(int[] stalls, int k) {
		Arrays.sort(stalls);
		
		int maxDistance = stalls[stalls.length - 1] - stalls[0];
		
		int answer = 0; 
		
		for(int distance = 1; distance <= maxDistance; distance++) {
			if(canPlaceCows(stalls, k, distance)) {
				answer = distance; 
			}
		}
		return answer; 
	}
	static boolean canPlaceCows(int[] stalls, int k, int distance) {
		int cowsPlaced = 1; 
		
		int lastPosition = stalls[0];
		
		for(int i=1; i<stalls.length; i++) {
			if(stalls[i] - lastPosition >= distance) {
				cowsPlaced++; 
				
				lastPosition = stalls[i];
			}
			if(cowsPlaced == k) {
				return true; 
			}
		}
		return false; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] stalls = new int[n];
		
		for(int i = 0; i<n; i++) {
			stalls[i] = sc.nextInt();
		}
	}

}
