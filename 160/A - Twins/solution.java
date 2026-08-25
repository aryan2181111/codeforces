import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] coins = new int[n];
        int total = 0;
 
        // Read coins and calculate total
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            total += coins[i];
        }
 
        // Sort in ascending order
        Arrays.sort(coins);
 
        int mySum = 0;
        int count = 0;
 
        // Take largest coins first
        for (int i = n - 1; i >= 0; i--) {
 
            mySum += coins[i];
            count++;
 
            int remainingSum = total - mySum;
 
            if (mySum > remainingSum) {
                break;
            }
        }
 
        System.out.println(count);
 
        sc.close();
    }
}