package arrayEasy;

public class Max_Product_SubArray {
	public static int maxProduct(int[] arr) {
		int maxProduct = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			int product = 1; 
			
			for(int j =i; j<arr.length; j++) {
				product *= arr[j];
				maxProduct = Math.max(maxProduct,product);
				
			}
		}
		return maxProduct; 
	}
	public static void main(String[] args) {
		int[] arr = {2,3,-2,4}; 
		System.out.println("MaxProduct = "+ maxProduct(arr));
	}

}
