package Binary_Search;

public class How_Many_Times_Array_Rotated {
	public static int countRotations(int[] arr) {
		int min = arr[0];
		int index = 0 ; 
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				index = i; 
			}
		}
		return index; 
	}

}
