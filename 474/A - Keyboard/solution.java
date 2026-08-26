import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        char direction = sc.next().charAt(0);
        String s = sc.next();
 
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < s.length(); i++) {
 
            char ch = s.charAt(i);
 
            int index = keyboard.indexOf(ch);
 
            if (direction == 'L') {
                // Original character is one key to the right
                result.append(keyboard.charAt(index + 1));
            } else {
                // Original character is one key to the left
                result.append(keyboard.charAt(index - 1));
            }
        }
 
        System.out.println(result);
 
        sc.close();
    }
}