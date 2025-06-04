import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int answer = 0;
		for (int i = 1; i <= N; i++) {
			int n = sc.nextInt();
			boolean flag = true;
			if(n == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(n); j++) {
				if (n % j == 0) {
					flag = false;
				}
			}
			if (flag) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}