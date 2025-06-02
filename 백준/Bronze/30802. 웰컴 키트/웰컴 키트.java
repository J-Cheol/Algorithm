import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] sizeArr = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			sizeArr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		int tshirtBundles = 0;
		for(int i = 0; i < 6; i++) {
			tshirtBundles += (sizeArr[i] + T - 1) / T;
		}

		int penBundles = N / P;
		int penSingles = N % P;

		bw.write(tshirtBundles + "\n");
		bw.write(penBundles + " " + penSingles + "\n");

		bw.flush();
		br.close();
		bw.close();
	}
}