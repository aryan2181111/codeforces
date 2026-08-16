import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        boolean[] seen = new boolean[26];
 
        for (int i = 0; i < n; i++) {
 
            char ch = Character.toLowerCase(s.charAt(i));
 
            int index = ch - 'a';
 
            seen[index] = true;
        }
 
        boolean pangram = true;
 
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                pangram = false;
                break;
            }
        }
 
        if (pangram) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}