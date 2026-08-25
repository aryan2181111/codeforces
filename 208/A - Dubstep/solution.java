import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        String result = s.replace("WUB", " ");
 
        result = result.trim().replaceAll("\\s+", " ");
 
        System.out.println(result);
 
        sc.close();
    }
}