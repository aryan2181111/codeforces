import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] count = new int[5];
 
        for (int i = 0; i < n; i++) {
            int group = sc.nextInt();
            count[group]++;
        }
 
        int taxis = 0;
 
        // Groups of 4
        taxis += count[4];
 
        // Groups of 3 + groups of 1
        int pairs31 = Math.min(count[3], count[1]);
 
        taxis += count[3];
        count[1] -= pairs31;
 
        // Groups of 2
        taxis += count[2] / 2;
 
        if (count[2] % 2 == 1) {
            taxis++;
 
            // One remaining group of 2 can take up to
            // two groups of 1
            count[1] = Math.max(0, count[1] - 2);
        }
 
        // Remaining groups of 1
        taxis += (count[1] + 3) / 4;
 
        System.out.println(taxis);
 
        sc.close();
    }
}