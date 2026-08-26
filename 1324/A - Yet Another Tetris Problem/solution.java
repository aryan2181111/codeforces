import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
 
            int first = sc.nextInt();
            int parity = first % 2;
 
            boolean same = true;
 
            for (int i = 1; i < n; i++) {
 
                int x = sc.nextInt();
 
                if (x % 2 != parity) {
                    same = false;
                }
            }
 
            if (same) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}