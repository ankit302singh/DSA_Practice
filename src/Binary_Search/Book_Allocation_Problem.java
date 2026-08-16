package Binary_Search;
import java.util.*;

public class Book_Allocation_Problem {
	/*
	static int findMinimum(int[] books, int students) {
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
			
			int remaining = solve(books, i+1, students - 1);
			
			int currentMax = Math.max(sum, remaining);
			
			answer = Math.min(answer, currentMax);
		}
		return answer; 
	}
	public static void main(String[] args) {
		int[] books = {12,34,67,90};
		int students = 2; 
		
		System.out.println(findMinimum(books, students));
	}
	*/
	
	// <<< Optimal Way (Binary Search) >>> 
	
	static boolean canAllocate(int[] books, int students, int limit) {
		
		int studentCount = 1; 
		
		int pages = 0; 
		
		for(int book : books) {
			if(pages + book <= limit) {
				pages += book; 
			}
			else {
				studentCount++; 
				pages = book; 
			}
		}
		return studentCount <= students; 
	}
	static int findMinimumPages(int[] books, int students) {
		if(students > books.length) {
			return -1; 
		}
		int low = 0; 
		int high = 0; 
		for(int book:books) {
			low = Math.max(low, book);
			high += book; 
		}
		int answer = -1; 
		
		while(low <= high) {
			int mid = low + (high - low) / 2; 
			
			if(canAllocate(books, students, mid)) {
				answer = mid; 
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		return answer; 
	}
	public static void main(String[] args) {
		
	}
}
