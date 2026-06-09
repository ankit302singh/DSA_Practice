package arrayEasy;

public class Count_Inversion_an_Array {
	
	/*
	public static void main(String[] args) {
		int[] arr = {5,3,2,4,1};
		int count = 0; 
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					count++; 
				}
			}
		}
		System.out.println("Inversion Count = "+ count);
	}
	*/
	public static void main(String[] args) {
		int[] arr = {5,3,2,4,1};
		int inversions = mergeSort(arr, 0, arr.length-1);
		System.out.println("Inversion Count = " + inversions);
	}
	static int mergeSort(int[] arr, int low, int high) {
		int count = 0; 
		if(low >= high) {
			return count ;
		}
		int mid = (low + high)/2;
		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid+1, high);
		count += merge(arr, low, mid, high);
		return count;
	}
	static int merge(int[] arr, int low, int mid, int high) {
		int count = 0; 
		int[] temp = new int[high - low +1];
		
		int left = low; 
		int right = mid + 1; 
		int k = 0; 
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			}
			else {
				count += (mid - left +1);
				temp[k++] = arr[right++];
			}
		}
		while(left <= mid) {
			temp[k++] = arr[left++];
		}
		while(right <= high) {
			temp[k++] = arr[right++];
		}
		for(int i = low; i<= high; i++) {
			arr[i] = temp[i-low];
		}
		return count;
	}

}
