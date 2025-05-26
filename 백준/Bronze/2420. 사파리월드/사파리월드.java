import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		sc.close();
		System.out.println(Math.abs(a - b));
	}
}