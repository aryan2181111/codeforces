import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] h = new int[n];
 
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
 
        // Sum of the first k planks
        int currentSum = 0;
 
        for (int i = 0; i < k; i++) {
            currentSum += h[i];
        }
 
        int minSum = currentSum;
        int answer = 0;
 
        // Slide the window
        for (int i = k; i < n; i++) {
 
            currentSum += h[i];
            currentSum -= h[i - k];
 
            if (currentSum < minSum) {
                minSum = currentSum;
                answer = i - k + 1;
            }
        }
 
        // Codeforces uses 1-based indexing
        System.out.println(answer + 1);
 
        sc.close();
    }
}