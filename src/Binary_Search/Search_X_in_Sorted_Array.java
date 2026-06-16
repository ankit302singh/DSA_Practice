package Binary_Search;

public class Search_X_in_Sorted_Array {
	public static int search(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				return i; 
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12};
		int x = 8; 
		int result = search(arr, x);
		
		System.out.println("Index = " + result);
	}

}
