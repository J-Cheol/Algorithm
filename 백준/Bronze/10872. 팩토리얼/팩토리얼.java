import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		int result = factorial(n);
		System.out.println(result);
	}

	private static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}
}