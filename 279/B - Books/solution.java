import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        long t = sc.nextLong();
 
        long[] books = new long[n];
 
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextLong();
        }
 
        int left = 0;
        long sum = 0;
        int maxBooks = 0;
 
        for (int right = 0; right < n; right++) {
 
            sum += books[right];
 
            while (sum > t && left <= right) {
                sum -= books[left];
                left++;
            }
 
            int currentLength = right - left + 1;
 
            maxBooks = Math.max(maxBooks, currentLength);
        }
 
        System.out.println(maxBooks);
 
        sc.close();
    }
}