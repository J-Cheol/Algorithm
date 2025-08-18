import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int i = 1;
        int j = 1;
        int k = 1;
        int year = 1;
        
        while(i != E || j != S || k != M) {
            i = (i % 15) + 1;
            j = (j % 28) + 1;
            k = (k % 19) + 1;
            
            year++;
        }
     
        
        System.out.println(year);
        br.close();
    }
}