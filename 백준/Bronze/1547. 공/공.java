import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int ballPos = 1;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x == ballPos || y == ballPos) {
                ballPos = (x == ballPos) ? y : x;
            }
        }
        
        System.out.println(ballPos);
        sc.close();
    }
}