import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int previous = sc.nextInt();
 
        int current = 1;
        int max = 1;
 
        for (int i = 1; i < n; i++) {
 
            int currentNumber = sc.nextInt();
 
            if (currentNumber >= previous) {
                current++;
            } else {
                current = 1;
            }
 
            if (current > max) {
                max = current;
            }
 
            previous = currentNumber;
        }
 
        System.out.println(max);
 
        sc.close();
    }
}