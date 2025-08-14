import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        boolean[] seats = new boolean[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rejectionCount = 0;
        for(int i = 0; i < N; i++) {
            int seat = Integer.parseInt(st.nextToken());
            if(!seats[seat]) {
                seats[seat] = true;
            } else {
                rejectionCount++;
            }
        }
        
        System.out.println(rejectionCount);
        br.close();
    }
}