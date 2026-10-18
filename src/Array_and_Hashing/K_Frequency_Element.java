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
        int[] frequency = new int[n];
        boolean[] selected = new boolean[n];

        for(int i = 0; i < n; i++){
            if(selected[i]){
                continue;
            }
            frequency[i] = 1;

            for(int j = i + 1; j < n ; j++){
                if(arr[i] == arr[j]){
                    frequency[i]++;
                    selected[j] = true;
                }
            }
        }
        int[] result = new int[k];
        boolean[] used = new boolean[n];

        for(int i = 0; i < k; i++){
            int maxfreq = -1;
            int maxIndex = -1;

            for(int j = 0; j < n; j++){
                if(!selected[j] && !used[j] && frequency[j] > maxfreq){
                    maxfreq = frequency[j];
                    maxIndex = j;
                }
            }
            result[i] = arr[maxIndex];
            used[maxIndex] = true;
        }
        System.out.println("Top K element: ");
        for(int value : result){
            System.out.print(value + " ");
        }
        sc.close();
    }
}
