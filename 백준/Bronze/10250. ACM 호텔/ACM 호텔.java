import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int Y = N % H;
			if (Y == 0) {
				Y = H;
			}

			int X = (N - 1) / H + 1;
			System.out.println("" + Y + (X > 9 ? "" : "0") + X);
		}

		sc.close();
	}
}