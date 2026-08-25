import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String original = sc.next();
        String translated = sc.next();
 
        String reversed = "";
 
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
 
        if (reversed.equals(translated)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}