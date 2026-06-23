package Binary_Search;

public class Floor_nd_Cell_in_sorted_Array {
	public static void floorCell(int[]arr, int x) {
		int floor = -1; 
		int ceil = -1; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= x) {
				floor = arr[i];
			}
			if(arr[i] >= x) {
				ceil = arr[i];
				break;
			}
		}
		System.out.println("Floor " + floor);
		System.out.println("Ceil " + ceil);
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int x = 7; 
	floorCell(arr,x);
	}

}
