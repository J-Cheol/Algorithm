import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10; i++) {
			sb.append(n + " * " + i +" = ").append(n * i).append("\n");
		}
		System.out.println(sb);
	}
}