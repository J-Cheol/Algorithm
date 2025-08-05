import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int F = sc.nextInt();
        
        int base = (N / 100) * 100;
        
        int remainder = base % F;
        
        int increment = (F - remainder) % F;
        int num = base + increment;
        
        System.out.printf("%02d\n", num % 100);
        
        sc.close();
    }
}