package Binary_Search;
import java.util.*; 

public class Painters_Partition {
	
	static boolean canPaint(int[] boards, int k , int limit ) {
		
		int painters = 1; 
		int currentSum = 0; 
		
		for(int board : boards) {
			if(board > limit) {
				return false ; 
			}
			if(currentSum + board <= limit) {
				currentSum += board; 
			}
			else {
				painters++; 
				currentSum = board; 
				
				if(painters > k) {
					return false; 
				}
			}
		}
		return true; 
	}
	
	static int painterPartition(int[] boards, int k) {
		int low = 0; 
		int high = 0; 
		
		for(int board : boards) {
			low = Math.max(low, board);
			high += board; 
		}
		while(low <= high) {
			int mid = low + (high - low) / 2; 
			
			if(canPaint(boards, k , mid)) {
				high = mid - 1; 
			}
			else {
				low = mid + 1; 
			}
		}
		return low; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of boards: ");
		int n = sc.nextInt();
		
		int[] boards = new int[n];
		
		System.out.println("Enter board Sizes: ");
		
		for(int i =0; i<n; i++) {
			boards[i] = sc.nextInt();
		}
		System.out.println("Enter number of painters: ");
		int k = sc.nextInt();
		
		int answer = painterPartition(boards, k);
		
		System.out.println(answer);
		
		sc.close();
	}

}
