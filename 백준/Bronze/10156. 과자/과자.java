import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int answer = (K * N) - M;
        System.out.println(answer > 0 ? answer : 0);
        
        sc.close();
    }
}