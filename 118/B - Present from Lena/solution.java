import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        // Top half
        for (int i = 0; i <= n; i++) {
 
            // Spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
 
            // Increasing numbers
            for (int j = 0; j <= i; j++) {
 
                if (j > 0) {
                    System.out.print(" ");
                }
 
                System.out.print(j);
            }
 
            // Decreasing numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }
 
            System.out.println();
        }
 
        // Bottom half
        for (int i = n - 1; i >= 0; i--) {
 
            // Spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
 
            // Increasing numbers
            for (int j = 0; j <= i; j++) {
 
                if (j > 0) {
                    System.out.print(" ");
                }
 
                System.out.print(j);
            }
 
            // Decreasing numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}