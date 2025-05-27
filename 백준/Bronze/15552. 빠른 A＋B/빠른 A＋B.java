import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			String line = br.readLine();
			String[] parts = line.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			bw.write((a + b) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}