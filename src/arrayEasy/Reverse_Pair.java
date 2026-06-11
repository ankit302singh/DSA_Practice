package arrayEasy;

public class Reverse_Pair {
	/*
	public static int reversePairs(int[] arr) {
// === Approach 1 =========		
	}
		
		int count = 0; 
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if((long) arr[i] > 2L * arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,1};
		System.out.println("ReversePair = " + reversePairs(arr));
	}
	*/
// ======== approach 2 ==========
    public static int reversePairs(int[] arr) {
    	return mergeSort(arr, 0, arr.length -1);
    }
    static int mergeSort(int[] arr, int low, int high) {
    	if(low >= high)
    		return 0; 
    	int mid = (low + high) / 2 ; 
    	int count = 0; 
    	count += mergeSort(arr, low, mid);
    	count += mergeSort(arr, mid + 1, high);
    	count += countPairs(arr, low, mid, high);
    	merge(arr, low, mid, high);
    	return  count; 
    }
    static int countPairs(int[] arr, int low, int mid, int high) {
    	int right = mid + 1; 
    	int count = 0; 
    	for(int i = low; i<= mid; i++) {
    		while(right <= high && (long) arr[i] > 2L * arr[right]) {
    			right++; 
    		}
    		count += right - (mid + 1);
    	}
    	return count ; 
    }
    static void merge(int[] arr, int low, int mid, int high) {
    	int[] temp = new int[high - low + 1];
    	int left = low; 
    	int right = mid + 1; 
    	int k = 0; 
    	
    	while(left <= mid && right <= high) {
    		if(arr[left] <= arr[right]) {
    			temp[k++] = arr[left++];
    		}
    		else {
    			temp[k++] = arr[right++];
    		}
    	}
    	while(left <= mid) {
    		temp[k++] = arr[left++];
    	}
    	while(right <= high) {
    		temp[k++] = arr[right++];
    	}
    	for(int i = 0; i < temp.length; i++) {
    		arr[low + i] = temp[i];
    	}
    }
    public static void main(String[] args) {
    	int[] arr = {1,3,2,3,1}; 
    	System.out.println("Reverse Pair = " + reversePairs(arr));
    }
}
