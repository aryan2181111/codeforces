import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        int answer = (m * n) / 2;
 
        System.out.println(answer);
 
        sc.close();
    }
}