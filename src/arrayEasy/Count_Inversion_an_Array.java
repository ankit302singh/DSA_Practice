package arrayEasy;

public class Count_Inversion_an_Array {
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

}
