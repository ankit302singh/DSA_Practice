package Array_and_Hashing;
import java.util.*;

public class K_Frequency_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k = sc.nextInt();

        if( k < 1 || k > n){
            System.out.println("Invalid K");
            sc.close();
            return;
        }
    }
}
