import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        // Remove '+'
        String[] parts = s.split("\\+");
 
        // Convert to numbers
        int[] nums = new int[parts.length];
 
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
 
        // Sort
        Arrays.sort(nums);
 
        // Print
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                System.out.print("+");
            }
 
            System.out.print(nums[i]);
        }
 
        sc.close();
    }
}