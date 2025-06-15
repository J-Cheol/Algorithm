import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int[] cards = new int[N];

		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st2.nextToken());
		}

		int max = 0;

		outer:
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if (sum > max && sum <= M) {
						max = sum;
					}
					if (sum == M) {
						break outer;
					}
				}
			}
		}

		System.out.print(max);
		br.close();
	}
}