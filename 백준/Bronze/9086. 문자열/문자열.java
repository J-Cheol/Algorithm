import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int i = Integer.parseInt(br.readLine());

		for(int j = 0; j < i; j++) {
			String line = br.readLine();
			int length = line.length();
			if(length > 1) {
				bw.write("" + line.charAt(0) + line.charAt(length - 1) + "\n");
			} else {
				bw.write("" + line.charAt(0) + line.charAt(0) + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}