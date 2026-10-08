package Array_and_Hashing;
import java.util.Scanner; 

public class Contains_Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean duplicate = false; 
		
		for(int i=0; i< n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					duplicate = true; 
					break; 
				}
			}
			if(duplicate) {
				break; 
			}
		}
		System.out.println("Contains Duplicate: "+ duplicate);
		sc.close();
	}

}
