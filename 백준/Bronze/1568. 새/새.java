import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long count = 1;
        long seconds = 0;
        
        while(N > 0) {
            if(count > N) {
                count = 1;
            }
            
            N -= count;
            seconds++;
            count++;
        }
        
        System.out.println(seconds);
        
        sc.close();
    }
}