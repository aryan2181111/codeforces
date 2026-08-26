import java.util.*;
 
public class Main {
 
    static class Laptop {
        int price;
        int quality;
 
        Laptop(int price, int quality) {
            this.price = price;
            this.quality = quality;
        }
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        Laptop[] laptops = new Laptop[n];
 
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int quality = sc.nextInt();
 
            laptops[i] = new Laptop(price, quality);
        }
 
        // Sort by price
        Arrays.sort(laptops, (a, b) -> a.price - b.price);
 
        for (int i = 1; i < n; i++) {
 
            if (laptops[i].quality < laptops[i - 1].quality) {
                System.out.println("Happy Alex");
                return;
            }
        }
 
        System.out.println("Poor Alex");
 
        sc.close();
    }
}