import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int year = sc.nextInt();
 
        while (true) {
 
            year++;
 
            String s = String.valueOf(year);
 
            boolean[] used = new boolean[10];
            boolean unique = true;
 
            for (int i = 0; i < s.length(); i++) {
 
                int digit = s.charAt(i) - '0';
 
                if (used[digit]) {
                    unique = false;
                    break;
                }
 
                used[digit] = true;
            }
 
            if (unique) {
                System.out.println(year);
                break;
            }
        }
 
        sc.close();
    }
}