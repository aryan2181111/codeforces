import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
        long k = sc.nextLong();
 
        long odds = (n + 1) / 2;
 
        if (k <= odds) {
            // We are in the odd numbers
            System.out.println(2 * k - 1);
        } else {
            // We are in the even numbers
            System.out.println(2 * (k - odds));
        }
 
        sc.close();
    }
}