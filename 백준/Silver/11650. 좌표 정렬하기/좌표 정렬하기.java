import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    private static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Point[] pts = new Point[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pts[i] = new Point(x, y);
        }
        
        Arrays.sort(pts, (a, b) -> {
            if(a.x == b.x) {
                return a.y - b.y;
            }
            return a.x - b.x;
        });
            
        StringBuilder sb = new StringBuilder();
        for (Point p : pts) {
            sb.append(p.x).append(' ').append(p.y).append('\n');
        }
        System.out.print(sb.toString());
    }
}