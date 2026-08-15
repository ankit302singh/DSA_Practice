package Binary_Search;
import java.util.*;

public class Book_Allocation_Problem {
	static int findMinimun(int[] books, int students) {
		if(students > books.length) {
			return -1; 
		}
		return solve(books, 0, students);
	}
	static int solve(int[] books, int index, int students) {
		
		if(students == 1) {
			int sum = 0; 
			
			for(int i= index; i < books.length; i++) {
				sum += books[i];
			}
			return sum; 
		}
		int answer = Integer.MAX_VALUE; 
		int sum = 0; 
		
		for(int i = index; i < books.length - students; i++) {
			sum += books[i];
		}
	}

}
