import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int ans = Integer.MIN_VALUE;
 
        ans = Math.max(ans, a + b + c);
        ans = Math.max(ans, a * b * c);
        ans = Math.max(ans, a + b * c);
        ans = Math.max(ans, a * b + c);
        ans = Math.max(ans, (a + b) * c);
        ans = Math.max(ans, a * (b + c));
 
        System.out.println(ans);
 
        sc.close();
    }
}