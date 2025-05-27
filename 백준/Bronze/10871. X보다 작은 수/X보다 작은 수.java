import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (a < x) {
				sb.append(a).append(" ");
			}
		}
		if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
			sb.deleteCharAt(sb.length() - 1);
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
		br.close();
	}
}