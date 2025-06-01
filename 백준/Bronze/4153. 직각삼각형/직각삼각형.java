import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			int[] arr = {a, b, c};
			Arrays.sort(arr);

			if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
				bw.write("right");
			} else {
				bw.write("wrong");
			}
			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();

	}
}