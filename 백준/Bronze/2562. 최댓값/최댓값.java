import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maxValue = -1;
		int position = 0;
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			if (n > maxValue) {
				maxValue = n;
				position = i + 1;
			}
		}
		System.out.println(maxValue);
		System.out.println(position);

		sc.close();
	}
}