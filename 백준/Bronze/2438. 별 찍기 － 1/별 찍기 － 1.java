import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < n; y++) {
			for (int x = 0; x <= y; x++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}