import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int div = 5; div <= N; div *= 5)
            cnt += N / div;

        System.out.println(cnt);
    }
}