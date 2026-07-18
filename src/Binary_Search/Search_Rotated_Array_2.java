package Binary_Search;
import java.util.Scanner;

public class Search_Rotated_Array_2 {
	//<<<< Via Linear Search >>>>
	public static boolean search(int[] arr, int target) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == target) {
				return true; 
			}
		}
		return false;
	}
	

}
