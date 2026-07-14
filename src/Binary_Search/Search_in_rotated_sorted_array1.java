package Binary_Search;
import java.util.Scanner;

public class Search_in_rotated_sorted_array1 {
	public static int search(int[]arr, int x) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == x) {
				return i; 
			}
		}
		return -1; 
	}

}
