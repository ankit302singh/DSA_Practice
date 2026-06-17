package Binary_Search;

public class Lower_Bound {
     public static int lowerBound(int[] arr, int x) {
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] >= x) {
    			return i; 
    		}
    	}
    	 return arr.length;
     }
     public static void main(String[] args) {
    	 int[] arr = {1,2,4,4,5,7}; 
    	 int x = 4; 
    	 System.out.println("Lower Bound = " + lowerBound(arr, x));
     }
}
