package Binary_Search;
import java.util.Scanner;

public class Count_Occurrence {
	public static int countOccurrence(int[] arr, int x) {
		int count = 0; 
		for(int num : arr) {
			if(num == x) {
				count++; 
			}
		}
		return count; 
	}

}
