package arrayEasy;
import java.util.*;
// ======= Better Approach (Swap + Sort ) ========
public class merge_two_sorted_Array_without_extraspace {
	public static void merge(int[] arr1, int[]arr2, int n, int m) {
		int left = n-1; 
		int right = 0;
		
		while(left >=0 && right < m) {
			if(arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				
				left--;
				right++;
			}
			else {
				break ; 
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
	public static void main(String[] args) {
		int[] arr1 = {1,4,8,10};
		int[] arr2 = {2, 3, 9};
		
		merge(arr1, arr2, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
