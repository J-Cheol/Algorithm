import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;

		for (int i = Math.max(1, N - 9 * String.valueOf(N).length()); i < N; i++) {
			int sum = i;
			int tmp = i;

			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			if (sum == N) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);
	}
}
