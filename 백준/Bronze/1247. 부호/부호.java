import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {
            int N = sc.nextInt();
            if(N == 0) {
                break;
            }
            BigInteger sum = BigInteger.ZERO;
            for(int i = 0; i < N; i++) {
                long num = sc.nextLong();
                sum = sum.add(BigInteger.valueOf(num));
            }

            int comparison = sum.compareTo(BigInteger.ZERO);
            if(comparison == 0) {
                System.out.println("0");
            } else if(comparison > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
        
        sc.close();
    }
}