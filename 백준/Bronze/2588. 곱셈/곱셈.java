import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= 100; i *= 10) {
			System.out.println(A * (B % 10));
			answer += (A * (B % 10)) * i;
			B /= 10;
		}
		System.out.println(answer);
		sc.close();

	}
}