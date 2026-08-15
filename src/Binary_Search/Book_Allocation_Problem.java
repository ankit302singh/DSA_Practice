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
		}
	}

}
