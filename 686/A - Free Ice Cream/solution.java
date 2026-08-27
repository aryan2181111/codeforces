import java.util.Scanner;
 
public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        
        int distressed = 0;
        
        for (int i = 0; i < n; i++) {
            String sign = scanner.next();
            long d = scanner.nextLong();
            
            if (sign.equals("+")) {
                x += d;
            } else {
                if (d <= x) {
                    x -= d;
                } else {
                    distressed++;
                }
            }
        }
        
        System.out.println(x + " " + distressed);
    }
}