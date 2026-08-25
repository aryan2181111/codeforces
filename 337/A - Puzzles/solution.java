import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int[] puzzles = new int[m];
 
        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.nextInt();
        }
 
        // Sort puzzle sizes
        Arrays.sort(puzzles);
 
        int answer = Integer.MAX_VALUE;
 
        // Check every group of n consecutive puzzles
        for (int i = 0; i <= m - n; i++) {
 
            int difference = puzzles[i + n - 1] - puzzles[i];
 
            answer = Math.min(answer, difference);
        }
 
        System.out.println(answer);
 
        sc.close();
    }
}