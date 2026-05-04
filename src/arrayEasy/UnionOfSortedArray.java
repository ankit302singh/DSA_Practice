package arrayEasy;
import java.util.List;
import java.util.Scanner ; 
import java.util.ArrayList; 

public class UnionOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		
		System.out.println("Enter 1st elements (sorted): ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
			
		}
		
		System.out.print("enter 2nd size: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		System.out.println("Enter element 2nd(sorteed):");
		for(int i=0; i<m; i++) {
			arr2[i] =sc.nextInt();
		}
		
		List<Integer> unionList = new ArrayList<>();
		List<Integer> intersectionList = new ArrayList<>();
		
		int i=0 , j=0; 
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				unionList.add(arr1[i]);
				i++; 
			}
			else if(arr1[i] > arr2[j]) {
				unionList.add(arr2[j]);
				j++;
			}
			else {
				unionList.add(arr1[i]);
				intersectionList.add(arr1[i]);
				i++; 
				j++; 
			}
		}
		while(i<arr1.length) {
			unionList.add(arr1[i]);
			i++; 
		}
		
		while(j<arr2.length) {
			unionList.add(arr2[j]);
			j++;
		}
		System.out.println("Union: " + unionList);
		System.out.println("Intersection: " + intersectionList);
		
		sc.close();

	}

}
