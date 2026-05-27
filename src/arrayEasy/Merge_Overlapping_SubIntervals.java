package arrayEasy;
import java.util.*;

public class Merge_Overlapping_SubIntervals {
	// ==== BETER WAY =====
	public static void main(String[] args) {
		int[][] intervals = {
				{1,3}, 
				{2,6}, 
				{8,10},
				{15,18}
		};
		// SORT INTERVALS 
		Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
		
		List<int[]> result = new ArrayList<>();
		// add first intervals 
		result.add(intervals[0]);
		// traverse remaining intervals 
		for(int i=1; i<intervals.length;i++) {
			int[] last = result.get(result.size() - 1);
			
			int currentStart = intervals[i][0];
			int currentEnd = intervals[i][1];
			
			//overlap exists 
			if(currentStart <= last[1]) {
				//merge intervals 
				last[1] = Math.max(last[1],currentEnd);
			}
			else {
				// no overlap 
				result.add(intervals[i]);
			}
		}
		for(int[] arr : result) {
			System.out.println(arr[0] + " "+ arr[1]);
		}
	}

}
