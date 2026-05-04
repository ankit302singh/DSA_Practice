package arrayEasy;
import java.util.*;
import java.util.Scanner; 

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       
       System.out.println("Enter the Element:");
       for(int i=0; i<n; i++) {
    	   arr[i] = sc.nextInt();
       }
       Set <Integer> set = new LinkedHashSet<>();
       
       for(int num:arr) {
    	   set.add(num);
       }
       int[] uniqueArr = new int[set.size()];
       int index =0; 
       for(int num : set) {
    	   uniqueArr[index++] = num; 
       }
       System.out.println("Array after removing duplicate:");
       for(int num : uniqueArr) {
    	   System.out.print(num+"");
       }
	} 
}


