import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 || b == 0) {
				break;
			}

			sb.append(a + b).append("\n");
		}
		System.out.println(sb);
	}
}