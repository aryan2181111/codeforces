import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int x = sc.nextInt();
 
        int answer = (x + 4) / 5;
 
        System.out.println(answer);
 
        sc.close();
    }
}