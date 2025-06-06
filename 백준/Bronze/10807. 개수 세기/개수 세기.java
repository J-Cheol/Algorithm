import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(v == n) {
				answer++;
			}
		}
		System.out.println(answer);

		br.close();
	}
}