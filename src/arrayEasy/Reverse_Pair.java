package arrayEasy;

public class Reverse_Pair {
	public static int reversePairs(int[] arr) {
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

}
