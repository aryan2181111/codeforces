import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] prices = new int[n];
 
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
 
        Arrays.sort(prices);
 
        int q = sc.nextInt();
 
        while (q-- > 0) {
 
            int x = sc.nextInt();
 
            int left = 0;
            int right = n - 1;
            int answer = 0;
 
            while (left <= right) {
 
                int mid = left + (right - left) / 2;
 
                if (prices[mid] <= x) {
                    // This drink is affordable
                    answer = mid + 1;
                    left = mid + 1;
                } else {
                    // Price is too high
                    right = mid - 1;
                }
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}