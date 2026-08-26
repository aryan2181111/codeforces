import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        TreeSet<Integer> set = new TreeSet<>();
 
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
 
        int size = set.size();
 
        // Only one distinct number
        if (size == 1) {
            System.out.println(0);
        }
 
        // Two distinct numbers
        else if (size == 2) {
 
            int[] a = new int[2];
            int index = 0;
 
            for (int x : set) {
                a[index++] = x;
            }
 
            int difference = a[1] - a[0];
 
            if (difference % 2 == 0) {
                System.out.println(difference / 2);
            } else {
                System.out.println(difference);
            }
        }
 
        // Three distinct numbers
        else if (size == 3) {
 
            int[] a = new int[3];
            int index = 0;
 
            for (int x : set) {
                a[index++] = x;
            }
 
            int d1 = a[1] - a[0];
            int d2 = a[2] - a[1];
 
            if (d1 == d2) {
                System.out.println(d1);
            } else {
                System.out.println(-1);
            }
        }
 
        // More than 3 distinct values
        else {
            System.out.println(-1);
        }
 
        sc.close();
    }
}