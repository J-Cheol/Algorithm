import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[][] physicals = new int[N][2];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            physicals[i][0] = Integer.parseInt(st.nextToken());
            physicals[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int[] rank = new int[N];
        Arrays.fill(rank, 1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (physicals[j][0] > physicals[i][0] && physicals[j][1] > physicals[i][1]) {
                    rank[i]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(rank[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}