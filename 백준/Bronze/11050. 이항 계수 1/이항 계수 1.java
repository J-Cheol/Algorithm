import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		if (K > N - K) {
			K = N - K;
		}

		long result = 1;
		for (int i = 0; i < K; i++) {
			result = result * (N - i) / (i + 1);
		}

		System.out.println(result);

		sc.close();
	}
}