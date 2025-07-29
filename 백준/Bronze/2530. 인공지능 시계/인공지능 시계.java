import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int D = sc.nextInt();
        
        int totalSeconds = A * 3600 + B * 60 + C;
        
        totalSeconds += D;
        
        int hours = (totalSeconds / 3600) % 24;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(hours + " " + minutes + " " + seconds);
        
        sc.close();
    }
}