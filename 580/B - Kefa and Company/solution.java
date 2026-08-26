import java.util.*;
 
public class Main {
 
    static class Friend {
        long money;
        long friendship;
 
        Friend(long money, long friendship) {
            this.money = money;
            this.friendship = friendship;
        }
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        long d = sc.nextLong();
 
        Friend[] friends = new Friend[n];
 
        for (int i = 0; i < n; i++) {
            long money = sc.nextLong();
            long friendship = sc.nextLong();
 
            friends[i] = new Friend(money, friendship);
        }
 
        // Sort by money
        Arrays.sort(friends, (a, b) ->
                Long.compare(a.money, b.money));
 
        long currentSum = 0;
        long answer = 0;
 
        int left = 0;
 
        for (int right = 0; right < n; right++) {
 
            currentSum += friends[right].friendship;
 
            // Make the window valid
            while (friends[right].money - friends[left].money >= d) {
                currentSum -= friends[left].friendship;
                left++;
            }
 
            answer = Math.max(answer, currentSum);
        }
 
        System.out.println(answer);
 
        sc.close();
    }
}