import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int layer = 1;
		int maxNum = 1;

		while (n > maxNum) {
			maxNum += 6 * layer;
			layer++;
		}

		System.out.println(layer);

		sc.close();
	}
}