package Binary_Search;

public class Floor_nd_Cell_in_sorted_Array {
// ====== Normal way ============
	/*
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
     */
// ====== Optimal Way =======
	public static void findFloorCeil(int[]arr, int x) {
		int low = 0; 
		int high = arr.length - 1; 
		int floor = -1; 
		int ceil = -1; 
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == x) {
				floor = arr[mid];
				ceil = arr[mid];
				break ; 
			}
			else if(arr[mid] < x) {
				floor = arr[mid];
				low = mid + 1; 
			}
			else {
				ceil = arr[mid];
				high = mid - 1; 
			}
		}
		System.out.println("Floor = " + floor );
		System.out.println("Ceil = " + ceil);
		

	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10}; 
		int x = 7; 
		
		findFloorCeil(arr, x);
	}
}
