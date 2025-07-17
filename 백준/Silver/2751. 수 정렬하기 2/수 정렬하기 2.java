import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        boolean[] positive = new boolean[1000001];
        boolean[] negative = new boolean[1000001];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num >= 0) {
                positive[num] = true;
            } else {
                negative[-num] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1000000; i >= 1; i--) {
            if (negative[i]) {
                sb.append(-i).append('\n');
            }
        }
        
        for (int i = 0; i <= 1000000; i++) {
            if (positive[i]) {
                sb.append(i).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}