import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++) {
            int m = Integer.parseInt(st2.nextToken());
            sb.append(numbers.contains(m) ? 1 : 0).append('\n');
        }
        
        System.out.print(sb);
        br.close();
    }
}