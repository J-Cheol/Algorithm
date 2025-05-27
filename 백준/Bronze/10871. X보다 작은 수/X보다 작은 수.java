import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < x) {
				sb.append(a).append(" ");
			}
		}
		if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
			sb.deleteCharAt(sb.length() - 1);
		}

		System.out.println(sb);
	}
}