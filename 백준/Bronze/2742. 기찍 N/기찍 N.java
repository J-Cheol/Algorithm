import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = N; i >= 1; i--) {
            sb.append(i).append('\n');
        }
        System.out.print(sb);
        sc.close();
    }
}